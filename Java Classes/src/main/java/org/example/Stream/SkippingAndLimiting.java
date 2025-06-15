package org.example.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SkippingAndLimiting {
    public static void main(String[] args) {
        IntStream.range(0, 30)
                .skip(10)
                .limit(11)
                .forEach(index -> System.out.print(index + " "));
        System.out.println();

        Path path = Path.of("Java Classes/src/main/java/org/example/firstNames.txt");

        try(Stream<String> lines = Files.lines(path)) {
            lines.skip(5).limit(10).forEach(name -> System.out.print(name + " "));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
