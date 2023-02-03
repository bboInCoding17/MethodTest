public class 메소드문제1_14 {
    public static void main(String[] args) {
        num(9);
    }
    //한 정수를 매개변수로 받아, 그 정수가 짝수이면 "짝수입니다"
    //홀수이면 "홀수입니다" 하는 메소드 선언 및 호출

    public static void num(int a){
        if(a % 2 ==0){
            System.out.println("짝수입니다");
        }
        else {
            System.out.println("홀수입니다");


        }
    }
}
