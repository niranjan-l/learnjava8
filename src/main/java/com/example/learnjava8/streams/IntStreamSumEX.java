package com.example.learnjava8.streams;

import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamSumEX {
    public static void main(String[] args) {


        System.out.println(IntStream.range(1, 20)
                .reduce(24,
                        (int a,int b)->a*12));


        //gives us infinte loop
        DoubleStream.generate(new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return 0;
            }
        }).forEach(System.out::println);


        //gives us infinte loop
        DoubleStream.generate(() -> 12).forEach(System.out::println);
    }

}
