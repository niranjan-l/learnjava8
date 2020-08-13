package com.example.learnjava8.streams;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMapEx {


    public static void main(String[] args) {


        List.of("niranjan", "rao", "lingutla")
                .stream().filter("niranjan" :: equals)
                .map(x->x.charAt(1))
                .collect(Collectors.toList());


    }
}
