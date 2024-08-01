package com.changyoun.section02.looping;

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
}
