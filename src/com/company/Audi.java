package com.company;

public class Audi extends Car {
    String engineType;

    void getName(){
        System.out.println("Get Name in Audi Class");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "engineType='" + engineType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
