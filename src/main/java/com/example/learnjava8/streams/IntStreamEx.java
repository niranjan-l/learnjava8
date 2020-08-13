package com.example.learnjava8.streams;

import java.util.stream.IntStream;

public class IntStreamEx {


    public static void main(String[] args) {


        IntStream
                .range(1,10)
                .skip(4)
                .forEach(System.out::print);

    }
}
