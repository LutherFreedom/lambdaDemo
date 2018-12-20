package com.luther.lambda;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/18 21:17
 * @UpdateTime: 2018/12/18 21:17
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class StreamTest {
    @Test
    public void testA() {
        List<Beatles> beatlesList = Lists.newArrayList(new Beatles("John Lennon", "china"),
                new Beatles("Paul McCartney", "London"),
                new Beatles("George Harrison", "London"),
                new Beatles("Ringo Starr", "London"));

        beatlesList = Stream.of(new Beatles("John Lennon", "china"),
                new Beatles("Paul McCartney", "London"),
                new Beatles("George Harrison", "London"),
                new Beatles("Ringo Starr", "London")).collect(Collectors.toList());
        beatlesList.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        }).count();
    }

    @Test
    public void testB() {
        List<String> list =
                Stream.of("a", "b", "hELLO", "Demo").map(str -> str.toUpperCase()).collect(Collectors.toList());
        Assert.assertEquals(Lists.newArrayList("A", "B", "HELLO", "DEMO"), list);
    }

    @Test
    public void testC() {
        Beatles beatles = Stream.of(new Beatles("John Lennon", "china"),
                new Beatles("Paul McCartney", "London"),
                new Beatles("George Harrison", "London"),
                new Beatles("Ringo Starr", "London")).min(Comparator.comparing(beat -> beat.getLength())).get();
    }

    @Test
    public void testD() {
        int count = Stream.of(1, 2, 3, 4).reduce(0, (acc, ele) -> acc + ele);
        System.out.println(count);

        int min = Stream.of(1, 2, 3, 4).reduce(1, (acc, ele) ->{
            return acc > ele ? ele : acc;
        });
        System.out.println(min);

        int max = Stream.of(1, 2, 3, 4).reduce(1, (acc, ele) ->{
            return acc < ele ? ele : acc;
        });
        System.out.println(max);


         count = Stream.of(1, 2, 3, 4).reduce( (acc, ele) -> acc + ele).get();
        System.out.println(count);
    }
}
