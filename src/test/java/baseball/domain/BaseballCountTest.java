package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BaseballCountTest {
    @Test
    public void 스트라이크가_세개면_isCorrect_true_이다() {
        Assertions.assertTrue(new BaseballCount(3, 0).isCorrect());
        Assertions.assertFalse(new BaseballCount(2, 1).isCorrect());
        Assertions.assertFalse(new BaseballCount(1, 2).isCorrect());
        Assertions.assertFalse(new BaseballCount(0, 3).isCorrect());
    }

}
