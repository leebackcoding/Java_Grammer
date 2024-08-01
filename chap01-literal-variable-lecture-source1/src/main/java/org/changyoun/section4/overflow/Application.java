package org.changyoun.section4.overflow;

public class Application {
    public static void main(String[] args) {
        /* 오버 플로우에 대해 이해할 수 있다. */

        byte num1 = 127;


        int firstNum = 1000000;			//100만
        int secondNum = 700000;			//70만

        int multi = firstNum * secondNum;		//7천억이 나와야 함

        System.out.println("firstNum * secondNum = " + multi);			//--79669248 이 나온다.

        long longMulti = (long) firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);

        System.out.println("longMulti = " + longMulti);

    }
}
