package com.example.learnjava8.streams;


import java.util.stream.Stream;

import static java.util.stream.Stream.of;

public class StaticImportVsNormalImportEx {

    public static void main(String[] args) {
        //normal import
        Stream<String> stringStream = Stream.of("niranjan", "rao", "lingutla");

        stringStream.forEach(System.out::println);


        //Static import
        Stream<String> stringStreamStatic = of("niranjan", "rao", "lingutla");

        stringStreamStatic.forEach(System.out::println);
    }
}
