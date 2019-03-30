package de.christianbergau.java12;

public class SwitchExpressions {

    public static void main(String... args) {
        System.out.println(describeInteger(1));
        System.out.println(describeInteger(2));
        System.out.println(describeInteger(3));
        System.out.println(describeInteger(4));
    }

    private static String describeInteger(int i) {
        return switch (i) {
            case 1, 2 -> "One or Two";
            case 3 -> "Three";
            default -> "unknown";
        };
    }
}
