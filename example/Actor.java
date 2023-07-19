package org.example;

public class Actor {
    private int id;
    private String name;
    private int birthYear;

    @Override
    public String toString() {
        return this.name;
    }

    public Actor(int id, String name, int birthYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }

}
