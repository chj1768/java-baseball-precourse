package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StrikeCounterTest {
    private StrikeCounter underTest;

    @BeforeEach
    void setUp() {
        underTest = new StrikeCounter();
    }

    @Test
    public void 공격_숫자가_방어_숫자와_같은_자릿수_이면서_포함되어_있으면_스트라이크가_카운팅된다() {
        BaseballCount baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), baseballCount);
        Assertions.assertEquals(baseballCount.getStrike(), 3);

        baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(2, 2, 3), baseballCount);
        Assertions.assertEquals(baseballCount.getStrike(), 2);

        baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(2, 1, 3), baseballCount);
        Assertions.assertEquals(baseballCount.getStrike(), 1);
    }

    @Test
    public void 공격_숫자가_방어_숫자와_같은_자릿수가_아니면서_포함되어_있으면_스트라이크가_카운팅_되지_않는다() {
        BaseballCount baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2), baseballCount);
        Assertions.assertEquals(baseballCount.getStrike(), 0);
    }

    @Test
    public void 공격_숫자가_방어_숫자와_같은_자릿수가_아니면서_포함되어_있지_않으면_스트라이크가_카운팅_되지_않는다() {
        BaseballCount baseballCount = new BaseballCount();
        underTest.count(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), baseballCount);
        Assertions.assertEquals(baseballCount.getStrike(), 0);
    }

}
