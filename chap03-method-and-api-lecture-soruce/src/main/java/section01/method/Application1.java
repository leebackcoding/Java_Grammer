package section01.method;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드 호출에 대한 흐름 */
        System.out.println("main 메소드 호출됨");

        /* 작성한 메소드를 호출한다. */
        Application1 app1 = new Application1();
        app1.methodA();


        System.out.println("main 메소드 종료됨");
    }

    // 클래스 내부에서 만든 함수는 메소드라고 부른다. (객체 지향에서 메소드 사용)
    public void methodA() {
        System.out.println("methodA 호출됨");
        methodB();
        System.out.println("methodA 종료됨");
    }
    
    public void methodB() {
        System.out.println("methodB 호출됨");
        methodC();
        System.out.println("methodB 종료됨");
    }
    
    public void methodC() {
        System.out.println("methodC 호출됨");

        System.out.println("methodC 종료됨");
    }
}
