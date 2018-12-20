package com.luther.lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:23
 * @UpdateTime: 2018/12/19 21:23
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class OptionalTest {
    @Test
    public void testA(){
        Optional o = Optional.empty();
        System.out.println(o.get());
    }

    @Test
    public void testB(){
        Optional o = Optional.empty();
        System.out.println(o.orElse("s"));
        System.out.println(o.orElseGet(()->"cc"));
    }

    @Test
    public void testC(){
        Artist artist = new Artist("Luther");
        List<Artist> artistList = Lists.newArrayList(artist);

        Artists artists = new Artists(artistList);

        Optional<Artist> op = artists.getArtist(1);

        op = artists.getArtist(0);

        String name = artists.getArtistName(0);

        name = artists.getArtistName(1);
        System.out.println(name);
    }


}
