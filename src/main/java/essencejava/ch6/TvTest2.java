package essencejava.ch6;

class Tv2{
    // Tv2의 멤버변수
    String color;
    boolean power;
    int channel;

    // Tv2의 메서드
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();     // t1이라는 객체 생성과 인스턴스 생성을 동시에
        Tv2 t2 = new Tv2();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;            // t1이 저장하고 있는 값(주소)를 t2에 저장
                            // t1과 t2는 참조변수 이므로 인스턴스의 주소를 가지고 있으며
                            // t2의 주소도 t1과 같아지기 때문에
                            // 쓸모없어진 t2가 참조하고 있던 인스턴스는 GC에 의해 메모리에서 삭제된다.
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }       // t1, t2 모두 t1의 인스턴스를 참조하고 있기 때문에 둘 다 7이 출력된다.
}