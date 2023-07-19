package org.example;

public class Director {
    private int id;



    private String name;
    private int birthYear;

    public Director(int id, String name, int birthYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return this.name;
    }
//    public String getName() {
//        return name;
//    }
}
