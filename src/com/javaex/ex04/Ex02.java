package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단을 입력해주세요");
        System.out.print("단 > ");

        int dan = scanner.nextInt();

        for (int i=1; i<=9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        scanner.close();
    }
}
