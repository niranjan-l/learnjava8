package com.example.learnjava8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FIleReadWithStreamsEx3 {

    public static void main(String[] args) throws IOException {


        Map<String, String[]> collect = Files.lines(Paths.get("C:\\Users\\lniranja\\OneDrive - Capgemini\\2020\\learnings\\learnjava8\\src\\main\\java\\com\\example\\learnjava8\\streams\\testfile.txt"))
                .map(x -> x.split(","))
                .filter(x -> x.length > 1)
                .collect(Collectors.toMap(x -> x[0], x -> x));


        collect.keySet().stream()
                .forEach(x -> {
                    System.out.println(x + "");
                    Arrays.stream(collect.get(x))
                            .parallel().
                            forEach(System.out::println);
                });


    }
}
