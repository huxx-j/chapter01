package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 > ");

            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num % 3 == 0) {
                System.out.println("3의 배수입니다.");
            } else {
                System.out.println("3의 배수가 아닙니다.");
            }
        }
        System.out.println("종료");
        scanner.close();
    }
}
