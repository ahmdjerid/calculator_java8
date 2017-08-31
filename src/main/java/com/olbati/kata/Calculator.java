package com.olbati.kata;

import java.util.Arrays;

/**
 * Hello world!
 */
public class Calculator {

    public static final String DELIMITER = "[\n,]";

    private String msg;
    private String delimiter;

    public Calculator(String msg, String delimiter) {
        this.msg = msg;
        this.delimiter = delimiter;
    }

    public static int calculate(String number) {
        if (number.isEmpty())
            return 0;
        else {
            return sum(number);
        }

    }

    private static int sum(String number) {

        Calculator parsedMessage = parseInputMessage(number);
        return Arrays.stream(parsedMessage.msg.split(parsedMessage.delimiter))
                .mapToInt(Integer::parseInt)
                .sum();
    }


    private static Calculator parseInputMessage(String number) {

        if (number.startsWith("//")) {
            String delimiter = number.substring(2, 3);
            number = number.split("\n")[1];
            return new Calculator(number, delimiter);

        } else return new Calculator(number, DELIMITER);
    }
}
