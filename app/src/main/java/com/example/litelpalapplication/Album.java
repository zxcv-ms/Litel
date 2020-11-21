package com.example.litelpalapplication;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

public class Album extends LitePalSupport {

    @Column(unique = true, defaultValue = "unknown")
    private String name;

    @Column(index = true)
    private float price;

    private List<Song> songs = new ArrayList<>();

    // generated getters and setters.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
