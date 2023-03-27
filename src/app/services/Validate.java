package app.services;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public static byte validateOptionInput(Scanner scan, String regex, String info) {
        String option;
        Pattern pattern = Pattern.compile(regex);
        do {
            option = scan.next().trim();
            Matcher match = pattern.matcher(option);
            if (match.matches()) {
                break;
            } else {
                System.out.print("Incorrect value!\n" + info);
            }
        } while (true);
        return Byte.parseByte(option);
    }
}
