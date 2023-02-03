public class 메소드문제1_15 {
    public static void main(String[] args) {
    num(1,9);
    }
    //두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 "두 수는 짝수입니다"
    //한 수만 짝수일 경우 ' 한 수만 짝수입니다'
    //두 수 모두 홀수 일 때는 "두 수는 홀수입니다" 출력

    public static void num(int a, int b){
        if(a % 2 ==0 && b % 2 ==0){
            System.out.println("두 수는 짝수입니다");
        } else if (a % 2 ==0 || b % 2 ==0) {
            System.out.println("한 수만 짝수입니다");

        }
        else{
            System.out.println("두 수는 홀수입니다");
        }
    }
}
