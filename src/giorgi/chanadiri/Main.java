package giorgi.chanadiri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> translate = new HashMap<>();
        translate.put("pen", "კალამი");
        translate.put("lesoon", "გაკვეთილი");
        translate.put("Teacher", "მასწავლებელი");

        Scanner scanner = new Scanner(System.in);
        System.out.println(translate.get(scanner.next()));


    }}



