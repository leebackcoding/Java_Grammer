package com.changyoun.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {
        /* if-else 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement() {
        /* if-else 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        /* 0인지 아닌지 조건 확인 */
        if(num != 0){

            /* 0인 경우에 다시 한 번 조건을 비교함 */
            /* 0보다 큰 숫자인지 확인 */
            if(num > 0){

                /* 0보다 더 큰 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 양수입니다.");
            }else{

                /* 0보다 더 작은 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 음수입니다.");
            }

        }else{

            /* 0인 경우 출력할 내용 */
            System.out.println("입력하신 숫자는 0 입니다.");
        }

        /* 조건문과 상관 없이 프로그램 종료 시 출력할 내용 */
        System.out.println("프로그램을 종료합니다.");
    }
}
