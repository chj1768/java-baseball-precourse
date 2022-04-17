package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BallCounterTest {
    private BallCounter underTest;

    @BeforeEach
    void setUp() {
        underTest = new BallCounter();
    }

    @Test
    public void 공격_숫자가_방어_숫자와_같은_자릿수가_아니면서_포함되어_있으면_볼이_카운팅된다() {
        BaseballCount baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2), baseballCount);
        Assertions.assertEquals(baseballCount.getBall(), 3);

        baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1), baseballCount);
        Assertions.assertEquals(baseballCount.getBall(), 2);

        baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 5), baseballCount);
        Assertions.assertEquals(baseballCount.getBall(), 1);
    }

    @Test
    public void 공격_숫자가_방어_숫자와_같은_자릿수_이면서_포함되어_있으면_볼이_카운팅_되지_않는다() {
        BaseballCount baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), baseballCount);
        Assertions.assertEquals(baseballCount.getBall(), 0);
    }

}
