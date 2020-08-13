package com.example.learnjava8.streams;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;

public class StreamUtilEx {

    public static void main(String[] args) {


        Stream<Integer> integerStream = of(1, 2, 3, 4);

        Stream<String> stringStream = of("niranjan", "rao", "lingutla");

        integerStream.forEach(System.out::println);
        Optional<String> first = stringStream.sorted().findFirst();
        first.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));


    }
}
