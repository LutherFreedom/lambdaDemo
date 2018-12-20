package com.luther.lambda;

import java.util.List;
import java.util.Optional;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:29
 * @UpdateTime: 2018/12/19 21:29
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Artists {
    private List<Artist> artistList;

    public Artists(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public Optional<Artist> getArtist(int index) {
        Optional<Artist> optional;
        if (index < 0 || index >= artistList.size())
            optional = Optional.empty();
        else
            optional = Optional.of(artistList.get(index));
        return optional;
    }

    public String getArtistName(int index) {
        Optional<Artist> artistOptional = getArtist(index);
        //这种是个好办法
        artistOptional.map(Artist::getName).orElse("unKnown");
        return artistOptional.orElse(new Artist("unKnown")).getName();
    }
}
