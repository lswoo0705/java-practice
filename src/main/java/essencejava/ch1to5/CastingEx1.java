package essencejava.ch1to5;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d; // double 타입인 변수 d를 int형으로 형변환

        System.out.println("score = " + score); // int형으로 형변환이 돼서 85라는 값이 출력
        System.out.println("d = " + d);         // 형변환 후에도 피연산자에는 변화가 없다.
    }
}