package com.changyoun.section02.looping;

import java.util.Scanner;

public class A_For {
    public void testSimpleForStatement() {
        /* for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. ㅁ*/
        for (int i = 0; i < 10; i++) {
            System.out.println("출력  : " + i);
        }
    }

    public void testForExample() {
        /* 1부너 10까지의 합계 구하기*/

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }


    public void testForExample2() {

        int rand = (int)(Math.random() * 6) + 5;
        int sum = 0;
        for(int i = 1; i <= rand; i++){
            sum += i;
        }

        System.out.println("1부터 " + rand + "까지의 합께 : " + sum);
    }


    public void testForExample3() {
        /* 숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합계를 구한다.
        * 동일한 숫자는 입력하지 않는다는 가정으로 해결한다.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int secondNum = sc.nextInt();

        int sum = 0;

        if (firstNum > secondNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
        }

        System.out.println(firstNum + "부터 " + secondNum + "까지의 합계 : " + sum);
    }


    public void printSimpleGugudan() {
        /* 사용자가 입력하는 단의 구구단을 출력하기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수 : ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9)
            for (int i = 1; i <= 10; i++)
                System.out.println(dan + " x " + i + " = " + (dan * i));
        else
            System.out.println("반드시 2~9 사이의 양수를 입력하셔야 합니다.");

    }
}
