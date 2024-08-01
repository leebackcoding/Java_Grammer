package org.changyoun.section5.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 자동 형변환 규칙 */

        /* 작은 자료형에서 큰 자료형으로 자동 형변환 */
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 문자형은 int로 자동 형변환 가능 */
        char ch1 = 'a';
        int charNumber = ch1;
        // int 로 type이 정해지지 않은 리터럴 형태의 정수는 char형 변수에 기록 가능
        char ch2 = 65;

        /* boolean은 형변환 규칙에서 제외된다. 어느 자료형이든 boolean을 형변환해서 담을 수 없다. */
    }
}
