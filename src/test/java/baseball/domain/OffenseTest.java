package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class OffenseTest {
    @Test
    public void offense_는_1_에서_9_사이의_중복되지_않은_세_자리_숫자로_변환_가능한_문자열만_허용한다() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("111"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("112"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("121"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("211"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("201"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("2113"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("1"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense(""));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense("null"));
        assertThrowsExactly(IllegalArgumentException.class, () -> new Offense(null));

        assertDoesNotThrow(() -> new Offense("123"));
        assertDoesNotThrow(() -> new Offense("456"));
    }
}
