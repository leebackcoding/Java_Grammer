package org.changyoun.section5.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 데이터 손실 */
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum); // 의도 하지 않은 데이터 손실에 유의

        double height = 175.5;
        int floorHeight = (int) height;
        System.out.println("floorHeight = " + floorHeight); // 소수점 절삭에 이용할 수 있다.

    }
}
