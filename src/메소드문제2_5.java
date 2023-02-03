public class 메소드문제2_5 {
//    //임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90이상이면 A
//    // 70이상이면 B
//    // 그 외의 수가 들어오면 C
    public static void main(String[] args) {
        num(78);

    }
//
    public static String num(int num1) {
        System.out.println(num1);

        return num1>90 ? "A" : "B";
    }
//     return num1>=70 ? "B" : "C";
}
