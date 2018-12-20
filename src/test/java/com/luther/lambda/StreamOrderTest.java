package com.luther.lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/20 21:10
 * @UpdateTime: 2018/12/20 21:10
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class StreamOrderTest {
    @Test
    public void testA() {
        List<Integer> numbers = Lists.newArrayList(15, 1, 6, 2, 7);

        List<Integer> sameOrder = numbers.stream().sorted().collect(Collectors.toList());
        for (Integer i : sameOrder) {
            System.out.println(i);
        }

        Function<Integer, Integer> aa = a -> a + 1;
        Optional<Integer> a = numbers.stream().collect(Collectors.maxBy(Comparator.comparing(aa)));
        a = numbers.stream().collect(Collectors.minBy(Comparator.comparing(aa)));

        ToDoubleFunction<Integer> bb = bbb -> bbb + 1;
        double d = numbers.stream().collect(Collectors.averagingDouble(bb));

        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(ap -> ap > 6));
        System.out.println("1111");
    }

    @Test
    public void testB() {
        List<Beatles> beatlesList = Stream.of(new Beatles("John Lennon", "china"),
                new Beatles("Paul McCartney", "London"),
                new Beatles("George Harrison", "London"),
                new Beatles("Ringo Starr", "London")).collect(Collectors.toList());
        Map<String, List<Beatles>> collect = beatlesList.stream().collect(Collectors.groupingBy(beatles -> beatles.getCountry()));
        System.out.println("111");
        Map<String, Long> map = beatlesList.stream().collect(Collectors.groupingBy(beatles -> beatles.getCountry(), Collectors.counting()));
        System.out.println("11");
    }

    @Test
    public void testC() {
        List<Integer> numbers = Lists.newArrayList(15, 1, 6, 2, 7);
        String result = numbers.stream().map(integer -> integer.toString()).collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
    }

    @Test
    public void testD() {
        List<Integer> numbers = Lists.newArrayList(15, 1, 6, 2, 7);
        StringBuilder result = numbers.stream().map(integer -> integer.toString()).reduce(new StringBuilder(),
                (builder, name) -> builder.append(name),
                (left, right) -> left.append(right));
        System.out.println(result.toString());
        System.out.println(1);
    }

    @Test
    public void testE() {
        Optional<Beatles> beatle = Stream.of(new Beatles("John Lennon", "china"),
                new Beatles("Paul McCartney", "London"),
                new Beatles("George Harrison", "London"),
                new Beatles("Ringo Starr", "London"))
                .collect(Collectors.maxBy(Comparator.comparing(beatles -> beatles.getName().length())));
        System.out.println(beatle.get());
    }

    @Test
    public void testF() {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

        names.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
    }
}