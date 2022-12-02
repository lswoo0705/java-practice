package lecture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PracticeTest {
    Practice practice = new Practice();

    @Test
    @DisplayName("sum 메소드 성공 테스트")
    void sumTest() {
        Integer sumInt = practice.sumInt(1, 2);

        assertNotNull(sumInt);
        assertEquals(sumInt, 3);
    }

    @Test
    @DisplayName("average 메소드 성공 테스트")
    void average() {
        Double average = practice.average(Arrays.asList(1, 2, 3, 5, 6));

        assertNotNull(average);
        assertEquals(average, 3.4);
    }
}