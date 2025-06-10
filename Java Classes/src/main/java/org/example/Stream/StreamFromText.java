package org.example.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamFromText {
    public static void main(String[] args) {
        Path path = Path.of("Java Classes/src/main/java/org/example/Stream/StreamFromText.java");

        try (Stream<String> lines = Files.lines(path)) {
            long count = lines.count();
            System.out.println("Count = " + count);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
