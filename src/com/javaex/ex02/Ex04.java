package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("점수를 입력하세요 >> ");
            try {
                int score = Integer.parseInt(scanner.nextLine());

                if (score >= 0 && score <= 100) {

                    if (score >= 60) {
                        System.out.println("합격입니다.");
                        break;
                    } else {
                        System.out.println("불합격입니다.");
                        break;
                    }
                } else {
                    System.out.println();
                    System.out.println("0~100사이 정수를 입력하세요");
                    System.out.println();
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("NumberFormatException 발생");
                System.out.println("0~100사이 정수를 입력하세요");
                System.out.println();
                continue;
            }
        }
        scanner.close();
    }
}

