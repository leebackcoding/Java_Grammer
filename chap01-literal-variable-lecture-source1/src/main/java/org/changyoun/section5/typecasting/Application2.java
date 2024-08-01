package org.changyoun.section5.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 강제 형변화의 규칙 */

        /* 정수끼리의 강제 형변호나 */
        long lnum = 8;
        int inum = (int) lnum; // 컴파일러가 데이터 손실 가능성을 컴파일 에러로 알리 -> 강제 형변환
        short snum = (short) inum;

        byte bnum = (byte) snum;

        /* 2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0; //float fnum = dnum;
        // 데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;
        // 그래서 fnum = 5.0f 이렇게 해줘야한다. (초기화 할때 )

        /* 문자형을 int 미만의 자료형으로 형변환 할 경우 강제 형변환이 필요 */
        char ch = 'a';
        byte bnum2 = (byte) ch;
        short snum2 = (short) ch;


        /* 논리형은 강제 형변환의 규칙에서도 제외된다. */
        boolean isTrue = true;
//        byte b = (byte) isTrue;

    }
}
