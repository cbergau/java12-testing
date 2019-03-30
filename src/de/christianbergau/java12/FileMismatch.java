package de.christianbergau.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

    public static void main(String... args) throws IOException {
        final long mistmatch = Files.mismatch(Path.of("file1.txt"), Path.of("file2.txt"));
        System.out.println(mistmatch);
    }

}
