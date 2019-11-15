package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {

    @Override
    public String draw() {
        return new StringJoiner(System.lineSeparator())
        .add("+++++++")
        .add("+     +")
        .add("+     +")
        .add("+++++++")
         .toString();
    }

}
