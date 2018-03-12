package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 >> ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력해주세요 >> ");
        int age = scanner.nextInt();
        System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
        scanner.close();

    }
}
