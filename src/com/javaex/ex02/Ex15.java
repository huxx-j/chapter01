package com.javaex.ex02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 > ");

        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A등급");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B등급");
        } else if (score >= 70 && score <= 79) {
            System.out.println("B등급");
        } else if (score >= 60 && score <= 69) {
            System.out.println("B등급");
        }else {
            System.out.println("F등급");
        }
        scanner.close();
    }
}
