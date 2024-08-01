package com.changyoun.section01.conditional;

import java.util.Scanner;

public class C_IfElseIf {
    public void testSimpleIfElseIfStatement() {
        /* if -elseif 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름 입력 : ");
        String name = sc.nextLine();
        System.out.println("학생 성적 입력 : ");
        int score = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 선언 */
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "점이며 등급은 " + grade + "입니다.");
    }
}
