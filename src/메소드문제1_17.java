public class 메소드문제1_17 {
    //한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언하고 호출
    public static void main(String[] args) {
        num(1000);
        num2(1, 12);
    }
    public static void num(int a){
        System.out.println(a);
    }
    //두 정수를 매개변수로 받아, 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언 후 출력
    public static void num2(int b, int c){

       if(b>c){
           int max = b;
           b =c;
           int min = c;
       }
       for(int i =0; i< b-1; i++){

       }
    }
}
