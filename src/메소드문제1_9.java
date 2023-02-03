public class 메소드문제1_9 {
    public static void main(String[] args) {
        name("김형진");
        age(33);
        address("울산");
        num("김형진", 33, "울산");

    }
    //이름을 매개변수로 받아 이름을 출력하는 메소드
    //나이를 매개변수로 받아 나이를 출력하는 메소드
    //주소를 매개변수로 받아 주소를 출력하는 메소드 선언 후 아래와 같이 출력

    public static void name(String name){
        System.out.println("이름은 " + name+ " 입니다.");

    }
    public static void age(int age){
        System.out.println("나이는 " + age + " 살 입니다.");
    }
    public static void address(String add){
        System.out.println("주소는 " +add + " 입니다. ");
    }

    //위의 문제를 하나의 메소드를 사용하여 출력 결과가 같게 프로그래밍
    public static void num(String name, int age, String add ){
        System.out.println("이름은 " + name+ " 입니다.");
        System.out.println("나이는 " + age + " 살 입니다.");
        System.out.println("주소는 " +add + " 입니다. ");
    }
    }

