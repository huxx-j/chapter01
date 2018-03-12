package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;

        System.out.println("단을 입력하세요");
        System.out.print("단 > ");

        int dan = scanner.nextInt();

        while (i <= 9) {
            System.out.println(dan + " * " + i + " = " + dan * i);

            i++;
        }
        scanner.close();
    }
}
