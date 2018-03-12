package com.javaex.ex02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("숫자를 입력하세요 > ");

            try {
                int num = Integer.parseInt(scanner.nextLine());

                if (num % 3 == 0) {
                    System.out.println(num + "은(는) 3의 배수 입니다.");
                    break;
                } else {
                    System.out.println(num + "은(는) 3의 배수가 아닙니다.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("숫자를 입력하세요");
            }
        }
        scanner.close();
    }
}
