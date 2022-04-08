package com.example.lesson6task4java.Moduls;

import java.io.Serializable;

public class User implements Serializable {
    String name;

    public User( String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" + ", name='" + name + '\'' + '}';
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return name;
    }
}
