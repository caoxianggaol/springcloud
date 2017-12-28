package com.kaishengit.pojo;

/**
 * Created by xiaogao on 2017/12/28.
 */
public class Movie {

    private int id;
    private String name;
    private String actor;

    public Movie() {
    }

    public Movie(int id, String name, String actor) {
        this.id = id;
        this.name = name;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
