public class 메소드04 {
    public static void main(String[] args) {
       // printSum(10, 9);
        int result = getSum(10,20);
        System.out.println(result);//result 는 30

        System.out.println(getSum(10,20)); // 30

    }
    //매개변수로 정수 두 개를 받아, 두 수의 합을 출력
    public static void printSum(int a, int b){
        System.out.println(a+b);

    }
    //매개변수로 정수 두 개를 받아, 두 수의 합을 리턴
    //void : 메소드 실행 후 리턴할 데이터가 없어요. 라는 뜻
    //void 자리인 리턴타입은 어떤 타입의 자료형이 들어 갈 수 있다
    //정수로 리턴 받기 위해 리턴 타입에 정수 자료형인 int를 넣어준다
    public static int getSum(int a, int b){
        return a+b;// a+b를 리턴한다,
        //리턴하다 : 메소드를 호출한 영역에 결과를 돌려 줌
        //리턴은 메소드의 마지막에 딱 한번만 호출 가능(return 뒤에 아무 코드도 읽히지x)

    }
}
