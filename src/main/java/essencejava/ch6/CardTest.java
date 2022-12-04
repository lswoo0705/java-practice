package essencejava.ch6;

class Card{
    String kind;                // 인스턴스마다 다를 수 있으므로 인스턴스변수
    int number;
    static int width = 100;     // 카드의 크기는 모든 인스턴스가 공유해야되므로 static을 붙여서 클래스변수로 선언
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") 입니다.");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;      // c1의 클래스 변수를 변경하면 c2의 클래스 변수도 변경된다.
        c1.height = 80;

        c1.kind = "Clover"; // c1의 인스턴스 변수를 변경하면 c1의 인스턴스 변수만 변경된다.
        c1.number = 9;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") 입니다.");
    }
}