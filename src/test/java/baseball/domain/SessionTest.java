package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SessionTest {
    private Session session;

    @BeforeEach
    void setUp() {
        session = new Session();
    }

    @Test
    public void isOut_이_false_이고_상태값이_변경되면_defence_가_재할당된다() {
        BaseballPlayer<List<Integer>> before = session.getDefence();

        session.setStatus("1");
        assertFalse(session.isOut());

        assertNotEquals(session.getDefence(), before);
    }

    @Test
    public void isOut_이_true_이고_상태값이_변경되면_defence_가_재할당되지_않는다() {
        BaseballPlayer<List<Integer>> before = session.getDefence();

        session.setStatus("2");
        assertTrue(session.isOut());

        assertEquals(session.getDefence(), before);
    }
}
