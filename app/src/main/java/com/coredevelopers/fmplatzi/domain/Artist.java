package com.coredevelopers.fmplatzi.domain;

/**
 * Created by sears on 17/06/16.
 */
public class Artist {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist(String name) {

        this.name = name;
    }
}
