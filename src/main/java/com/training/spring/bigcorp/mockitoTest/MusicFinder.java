package com.training.spring.bigcorp.mockitoTest;

import java.util.List;


public interface MusicFinder {
    List<Album> findByArtist(String artist);
    List<Album> findByName(String name);
}