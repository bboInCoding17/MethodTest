import javax.naming.Name;
import java.util.Scanner;

public class 메소드문제1_12 {
    //이름을 매개변수로 받아 이름을 출력하는 메소드
    //나이를 매개변수로 받아 나이를 출력하는 메소드
    //주소를 매개변수로 받아 주소를 출력하는 메소드 선언 후 출력
    //스캐너 이용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        String c = sc.next();
        num(a,b,c);




    }
    public static void num (String num2, int age, String address){

        System.out.println("이름은 " + num2 + " 입니다.");
        System.out.println("나이는 " + age + " 살 입니다.");
        System.out.println("주소는 " +address + " 입니다. ");
    }
}
