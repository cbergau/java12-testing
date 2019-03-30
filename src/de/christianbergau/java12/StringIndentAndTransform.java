package de.christianbergau.java12;

public class StringIndentAndTransform {

    public static void main(String... args) {
        System.out.println("foobar".indent(-1)); // Prints "foobar"
        System.out.println("foobar".indent(0)); // Prints "foobar"
        System.out.println("foobar".indent(5)); // Prints "     foobar"

        final Integer result = "42".<Integer>transform(Integer::valueOf);
        System.out.println(result);
    }

}
