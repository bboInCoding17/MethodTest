public class 메소드문제1_1 {

    public static void main(String[] args) {
    hello("안녕하세요");
    welecom("반갑습니다");
    hello2("어서오세요");
    num(7);
    string("배고파");
    num2(10, 100);
    num3(10,10,10);
    num4(10, 4);
    String2("안녕", "나미");

    }
    //"안녕하세요"라는 문자열을 출력하는 기능을 가진 메소드를 선언하고, 호출하기
    public static void hello(String a){
        System.out.println("인사말 남기세요 : " + a);
    }

    //"반갑습니다"라는 문자열을 출력하는 기능을 가진 메소드와 "어서오세요"
    //라는 문자열을 출력하는 메소드를 각각 선언하고, 실행 결과 반갑습니다. 어서오세요
    //라는 문자열이 출력되게 호출하기
    public static void welecom(String b){
        System.out.print(b + " ");
    }
    public static void hello2(String c){
        System.out.println(c);
    }

    //정수 하나를 매개 변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하자
    public static void num(int num1){
        System.out.println("값을 입력하세요 : "+ num1);
    }

    //문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출하자
    public static void string(String num2){
        System.out.println("문자열을 입력하세요 : "+ num2);
    }

    //정수 두개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출하자
    public static void num2(int a, int b){
        System.out.println("입력한 두 수의 합은 : "+ (a+b));
    }

    //정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해보세요
    public static void num3(int c, int d, int f){
        System.out.println("입력한 세 수의 곱은 : " + (c*d*f));
    }
    //두 정수를 매개변수로 받아, 두 정수의 나눈셈 몫과 나머지를 출력하는 메소드를 선언하고 호출

    public static void num4(int aa, int bb){
        System.out.println("입력받은 두 수의 나눗셈 몫 은 :" + (aa /bb));
        System.out.println("입력받은 두 수의 나눗셈의 나머지는 :" + (double)(aa + bb)%2);
    }

   // 두 문자열을 매개변수로 받아, 두 문자열의 나열 결과를 출력하는 메소드를 선언하고 호출
    public static void String2(String q, String p){
        System.out.println("두 문자열의 나열 :" + q + " "+ p);
    }
}
