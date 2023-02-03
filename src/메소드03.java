public class 메소드03 {
    public static void main(String[] args) {
        //메소드를 호출할 때는
        //메소드명이 같아야 하고, 매개 변수의 정보도 감아야함
        //메개변수의 정보 : 자료형,매개변수의 개수.
        tellAge(20);
        tellAge(30);
//        tellAge("java"); 자료형 불일치
//        tellAge(); 매개 변수의 개수 일치 (1개 이상)
        tellInfo("양보임", 20);

    }

   public static void tellAge(int age){
       System.out.println("나이는 " + age);//나이는 20
//       나이는 30

   }

    public static void tellInfo(String name, int age){
        System.out.println("이름은 "+ name);
        System.out.println("나이는 " + age);

    }


}
