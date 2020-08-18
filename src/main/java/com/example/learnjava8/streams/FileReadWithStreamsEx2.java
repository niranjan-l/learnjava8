package com.example.learnjava8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWithStreamsEx2 {
    public static void main(String[] args) throws IOException {

        //Streams lines from a file ,map ,reduce
        System.out.println(Files.lines(Paths.get("C:\\Users\\lniranja\\OneDrive - Capgemini\\2020\\learnings\\learnjava8\\src\\main\\java\\com\\example\\learnjava8\\streams\\testfile.txt"))
                .map(x -> x.split(","))
                .filter(x -> x.length > 1)
                .count());

    }
}
