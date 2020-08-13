package com.example.learnjava8.streams;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("niranjan", "rao", "lingutla");
        stringList.stream()
                .forEach(System.out::println);
    }
}
