package com.training.spring.bigcorp.mockitoTest;

import java.util.List;

public class Album {
    private String id;
    private String name;
    private List<String> artist;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getArtist() {
        return artist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    public Album withId(String id) {
        this.id = id;
        return this;
    }

    public Album withName(String name) {
        this.name = name;
        return this;
    }

    public Album withArtist(List<String> artist) {
        this.artist = artist;
        return this;
    }
}
