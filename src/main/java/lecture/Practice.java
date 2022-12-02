package lecture;

import java.util.List;

public class Practice {     // 구현 클래스
    public Integer sumInt(int a, int b) {
        return a + b;
    }
    public Double average(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}