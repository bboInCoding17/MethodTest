import java.util.Scanner;

public class 메소드문제1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        num(c,d);

    }
    //Scanner로 정수 두 개를 입력받아, 입력받은 두 수의 매개변수로 사용하여 두 수의 합을 선언 및 출력

    public static void num(int a, int b){
        System.out.println("두 수의 합은 : "+ (a+b));
    }
}
