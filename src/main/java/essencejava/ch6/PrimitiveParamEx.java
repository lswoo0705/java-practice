package essencejava.ch6;

class Data{
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);  // 참조형 매개변수 x에 10을 대입한 것을 출력

        change(d.x);    // change 메서드에서 x = 1000으로 변경했지만, 메서드 종료 메모리에서 제거되기 때문에 다시 x = 10으로 된다.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){  // 기본형 매개변수가 parameter로 들어가서 메소드 완료 후 제거되지만,
        x = 1000;               // parameter에 Data d를 넣는다면 값이 저장된 주소를 change메서드에 넘겨주었기 때문에 값이 변경되어 출력된다.
        System.out.println("change() : x = " + x);
    }
}
