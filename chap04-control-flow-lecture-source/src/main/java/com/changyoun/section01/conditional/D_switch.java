package com.changyoun.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        /* switch 문 사용데 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);


        int result = 0;

        switch (op) { // 실수 값은 switch 문에서 사용할 수 없다.
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
            case 'x' :
                result = first * second;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
            default: break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSwitchStatement() {
        /* switch 문 사용데 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);


//        int result = 0;

//        switch (op) { // 실수 값은 switch 문에서 사용할 수 없다.
//            case '+' : result = first + second;break;
//            case '-' : result = first - second;break;
//            case '*' :
//            case 'x' : result = first * second; break;
//            case '/' : result = first / second; break;
//            case '%' : result = first % second;break;
//            default: break;
//        }

        /* -> 를 사용하면 break를 사용한 것과 동일하며 오히려 작성하면 오류가 발생함
        * 2개 이상의 명령문을 작성해야할 경우 {}로 표기해야 함
        * 반환 값을 리턴할 수 있음. 단, 반드시 default 가 있어야 함 */
        int result = switch (op) {
            case '+' -> {
                yield first + second;
            }
            case '-' -> first - second;
            // second가 0이면 발생할 수 있는 런타임 오류
            case '*', 'X', 'x' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;
        };

        System.out.println(result); // "Three" 출력

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
