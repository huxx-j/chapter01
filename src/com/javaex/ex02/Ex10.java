package com.javaex.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 > ");

            try {
                int num = scanner.nextInt();
                System.out.println(num);
            } catch (InputMismatchException e) {
                System.out.println("*");
            }
        }
    }
}
