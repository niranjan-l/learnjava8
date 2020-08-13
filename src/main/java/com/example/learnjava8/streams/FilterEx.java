package com.example.learnjava8.streams;

import java.util.List;
import java.util.function.Consumer;

public class FilterEx {

    public static void main(String[] args) {

        List.of("niranjan", "rao", "lin")
                .stream()
                .filter("niranjan"::equals)
                .forEach(System.out::println);
    }
}
