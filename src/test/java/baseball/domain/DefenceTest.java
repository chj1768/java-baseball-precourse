package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DefenceTest {
    @Test
    public void Defence_는_랜덤한_1_9_사이의_세_자리_숫자로_이루어진다() {
        List<Integer> result = new Defence().play();
        assertTrue(result.size() == 3);
        Integer one = result.get(0);
        assertTrue(one >= 1 && one <= 9);
        Integer two = result.get(1);
        assertTrue(two >= 1 && two <= 9);
        Integer three = result.get(2);
        assertTrue(three >= 1 && three <= 9);
    }
}
