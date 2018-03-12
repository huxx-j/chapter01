package com.javaex.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 > ");

            try {
                int num = Integer.parseInt(scanner.nextLine());
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("!");

            }
        }
    }
}
