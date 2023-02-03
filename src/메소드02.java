public class 메소드02 {
    public static void main(String[] args) {
        //메소드의 호출은 main 메소드에서만 할 수 있는게 아니다!
        for(int i =0; i<5; i++){
            hello();

        }
    }
    //'안녕하세요'를 출력하는 hello라는 메소드 선언
    public static void hello(){
        System.out.println("안녕하세요 ");
        tellName();
    }
    public static void tellName(){
        System.out.println("이름은 홍길동 입니다. ");

    }




}
