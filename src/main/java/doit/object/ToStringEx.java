package doit.object;        // Object 클래스의 toString() 매서드 사용하기

class Book{
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {     // 책 번호와 제목을 매개변수로 받는 생성자
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {      // toString() 메서드 재정의
        return bookTitle + "," + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200,"개미");    // 값을 지정하여 초기화

        System.out.println(book1);
        System.out.println(book1.toString());   // toStringdms Book클래스의 메서드가 아니라 Object 클래스의 메서드이다.
    }
}
