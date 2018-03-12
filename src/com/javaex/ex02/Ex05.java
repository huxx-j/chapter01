package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력하세요 >> ");
            int i = scanner.nextInt();

            if (i > 0) {
                System.out.println("양수입니다.");
                continue;
            } else if (i < 0) {
                System.out.println("음수입니다.");
                continue;
            } else {
                System.out.println("0입니다.");
                continue;
            }
        }
    }
}
