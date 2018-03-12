package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. [0이면 종료]");
        int num;
        int sum = 0;
        boolean run = true;
        //12

            do {
                num = scanner.nextInt();
                if (num != 0) {
                    sum += num;
                    System.out.println("합계 : " + sum);
                } else {
                    System.out.println("합계 : " + sum);
                    run = false;
                }
            } while (run);
        System.out.println("종료");
    }
}

