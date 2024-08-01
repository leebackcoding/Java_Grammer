package section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해서 이해하고 호출 시 사용할 수 있다. */
        Application4 app4 = new Application4();

        int age = 20;
//        app3.testMethod(age);

//        app3.testMethod(age * 3);

        byte byteAge = 10;
//        app3.testMethod(byteAge);

//        long longAge = 20;
//        app3.testMethod(longAge); // 자동 형변환이 안된다.

        long longAge = 20;
        app4.testMethod("홍길동", 20, '남');
//        app4.testMethod("홍길동", '남', 20); 매개변수 순서가 바뀌면 안된다.
    }

    /* int 타입의 매개변수를 전달 받는 메소드 선언 */
    public void testMethod(String name, int age, final char gender) {
        /* 매개변수도 일종의 지역변수이다. final 키워드도 사용 가능하다.
         * 단, 상수 네이밍 규칙은 선택적으로 따르는 경향이 있다. */
//        name = "홍길동";
//        age = 20;
//        gender = 'M';
        System.out.println("당신의 이름은 " + name + "이고, 나이는 "
                + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
