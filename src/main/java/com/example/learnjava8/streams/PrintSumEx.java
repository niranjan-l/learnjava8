package com.example.learnjava8.streams;

import java.util.stream.IntStream;

public class PrintSumEx {

    public static void main(String[] args) {


        System.out.println(IntStream.range(1, 6)
                .sum());
    }
}
