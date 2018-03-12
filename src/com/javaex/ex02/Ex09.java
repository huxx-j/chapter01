package com.javaex.ex02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("점수를 입력하세요 > ");

            try {

                int score = Integer.parseInt(scanner.nextLine());

                if (score <= 100 && score >= 0) {
                    if (score >= 90) {
                        System.out.println("A 등급");
                        break;
                    } else if (score >= 80 && score <= 89) {
                        System.out.println("B 등급");
                        break;
                    } else if (score >= 70 && score <= 79) {
                        System.out.println("C 등급");
                        break;
                    } else if (score >= 60 && score <= 69) {
                        System.out.println("D 등급");
                        break;
                    } else {
                        System.out.println("F 등급");
                        break;
                    }

                } else {
                    System.out.println("0~100 사이 정수를 입력하세요");
                }

            } catch (NumberFormatException e) {

                System.out.println("0~100 사이 정수를 입력하세요");
            }
        }
        scanner.close();
    }
}
