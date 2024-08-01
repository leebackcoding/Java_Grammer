package section01.method;

public class Application7 {

    public static void main(String[] args) {
        /* static 메소드를 호추할 수 있다. */

        System.out.println(Application7.plus(10, 20));

        /* 동일 클래스 내에서 static 메소드 호출 시 클래스 명 생략 가능 */
        System.out.println(plus(10, 20));
    }

    public static int plus(int a, int b) {
        return a + b;
    }

}
