package com.javaex.ex05;

public class Ex01 {
    public static void main(String[] args) {
        int[] leftArray = new int[]{10, 20, 30};
        int[] rightArray = new int[]{10, 20, 30};

        if (leftArray.length != rightArray.length) {
            System.out.println("두배열의 크기가 다릅니다.");
        } else {
            for (int i = 0; i < leftArray.length; i++) {
                if (leftArray[i] != rightArray[i]) {
                    System.out.println(i + " 번째 값이 다릅니다.");
                }
            }
        }
    }
}

