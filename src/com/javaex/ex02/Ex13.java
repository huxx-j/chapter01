package com.javaex.ex02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("월을 입력하세요");

        int code = scanner.nextInt();

        if (code>0 && code<=12) {
            switch (code) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(code + "월은 30일 입니다.");
                    break;

                case 2:
                    System.out.println(code + "월은 28일 입니다.");
                    break;

                default:
                    System.out.println(code + "월은 31일 입니다.");
                    break;

            }
        } else {
            System.out.println("1~12 까지 정수를 입력하세요");
        }
        scanner.close();
    }
}
