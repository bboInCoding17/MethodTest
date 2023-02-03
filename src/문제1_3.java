public class 문제1_3 {
    public static void main(String[] args) {
        test1_3(50); // 선언 후 메소드 명(매개변수 값) 입력 후 호출
        printMaxNum(10,200);
    }
    //정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드 선언 및 호출

    public static void test1_3(int num){
        System.out.println("숫자의 값은 : " + num ); // 메소드 조건 선언
    }
    //매개변수로 두 정수를 받아, 두 수 중 큰 수를 출력
    public static void printMaxNum(int num1,int num2){
        int max;
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        System.out.println("입력한 수 중 큰 수는 " + max);
    }




}
