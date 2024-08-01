package section04;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Saccner 를 이용한 다양한 자료형 값 입력 받기*/

        /* 1. Scanner 객체 생성*/
        Scanner scanner = new Scanner(System.in);

        /* 2. 자료형별 값 입력 받기 */
        /* 2-1. 문자열 입력 : nextLine() */
//        System.out.print("이름 입력 : ");
//        String name = scanner.nextLine();
//        System.out.println("입력 받은 값 : " + name);

        /* 2-2. 정수형 입력 : nextInt() */
        /* 숫자가 아닌 값을 입력하면 java.util.InputMismatchException 이 발생 (런타임 에러)*/
        /* 런타임 에러는 실행을 시켜야지 에러가 보인다. */
//        System.out.print("나이 입력 : ");
//        int age = scanner.nextInt();
//        System.out.println("입력 받은 값 : " + age);

        /* 2-3. 실수형 입력 : nextDouble() */
        // 정수값 입력은 실수로 반환되지만 숫자가 아니 ㄴ값 입력하면
        // java.util.InputMismatchException 이 발생 (런타임 에러)
//        System.out.print("키 입력 : ");
//        double height = scanner.nextDouble();
//        System.out.println("입력 받은 값 " + height);

        /* 2-4. 논리값 입력 */
//        true or false 외의 아닌 값을 입력하면 java.util.InputMismatchException 이 발생 (런타임 에러)
//        System.out.println("참고 거짓 중 하나를 true or false 로 입력");
//        boolean isTrue = scanner.nextBoolean();
//        System.out.println("입력 받은 값 : " + isTrue);

        /* 2-5. 문자값 입력 */
        System.out.print("아무 문자나 입력 : ");
        char ch = scanner.next().charAt(5);
        System.out.println(ch);


    }
}
