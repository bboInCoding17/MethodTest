import java.util.Scanner;

public class 메소드문제2_2 {
    //scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 곱을 리턴하는 메소드 선언 후 호출

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        num(a, b);
        System.out.println("두 정 수의 곱은 : " + a * b);

    }
    public static int num(int num1, int num2){
        return num1 * num2;
    }
}
