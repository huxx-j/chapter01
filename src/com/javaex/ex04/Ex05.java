package com.javaex.ex04;

public class Ex05 {
    public static void main(String[] args) {

        int i = 6;
        int k = 14;
        int a = 1;

        while (true) {

            if (a % i == 0 && a % k == 0) {
                System.out.println(a);
                break;
            } else {
                a++;
            }
        }
    }
}
