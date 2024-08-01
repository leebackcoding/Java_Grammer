package com.changyoun.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 시작");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void printStarInputRowTimes() {
        /* 입력받은 정수만큼 한 행에 '*' 5개씩 출력 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수 입력 : ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
