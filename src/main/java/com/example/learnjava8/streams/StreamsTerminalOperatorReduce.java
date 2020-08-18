package com.example.learnjava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.List.of;


public class StreamsTerminalOperatorReduce {

    public static void main(String[] args) {


        List<String> niranjanList = of("niranjan", "Rao", "lingutla");

        List<String> vanithaList = of("vanitha", "lakshmi", "jagalamarri");
        //first type with out identity returns us a Optional<T>
        niranjanList.stream().reduce((s1, str) -> s1.concat(str)).ifPresent(System.out::println);

        //Second type with identity return us <T>
        System.out.println("result string is " + niranjanList.stream().reduce("niranjan", (start, end) -> start + end));

        //Api chain logic for reduce function
        boolean seen = false;
        String acc = null;
        for (String s : niranjanList) {
            if (!seen) {
                seen = true;
                acc = s;
            } else {
                acc = acc.concat(s);
            }
        }
        (seen ? Optional.of(acc) : Optional.<String>empty()).ifPresent(System.out::println);

        //reduce function with identity ,accumulator and combiner (these function should be stateless
        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
        int computedAges =
                users
                        .stream()
                        .reduce(0, (partialAgeResult, names) -> partialAgeResult + names.getAge(), (a, b) -> Integer.sum(a, b));
    }

    private static class User {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private int age;

        public User(String name, int age) {

        }
    }
}
