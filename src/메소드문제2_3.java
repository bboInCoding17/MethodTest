public class 메소드문제2_3 {
    //두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언
    public static void main(String[] args) {

    }

    public static int getMax(int num1, int num2){
//        if(num1>num2){
//            return num1;
//
//        }else{
//            return num2;
//        } //if 문 안에서는 retrun 이 각각 쓰일 수 있다(if 문이 동시에 쓰이지 x)
        //삼항 연산자
        //참 또는 거짓 조건 ? 참인 경우 값 : 거짓일 때 값

        return num1> num2 ? num1 : num2;
    }
}
