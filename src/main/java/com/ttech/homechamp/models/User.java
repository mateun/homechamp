package com.ttech.homechamp.models;

/**
 * Created by martin on 11/06/2017.
 */
public class User {

    private int id;
    private String userName;
    private String score;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
