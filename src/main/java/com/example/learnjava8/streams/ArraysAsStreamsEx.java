package com.example.learnjava8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysAsStreamsEx {

    public static void main(String[] args) {


        String[] a = {
                "niranjan", "rao", "lingutla"
        };
        Arrays.stream(a)
                .forEach(System.out::println);
    }
}
