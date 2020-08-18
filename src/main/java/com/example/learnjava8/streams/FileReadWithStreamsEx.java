package com.example.learnjava8.streams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWithStreamsEx {

    public static void main(String[] args) throws IOException {

        var lines = Files.lines(Paths.get("C:\\Users\\lniranja\\OneDrive - Capgemini\\2020\\learnings\\learnjava8\\src\\main\\java\\com\\example\\learnjava8\\streams\\niranjan"));
        lines.forEach(System.out::println);
        lines.close();
    }
}
