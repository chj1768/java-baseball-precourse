package baseball.domain;

import org.assertj.core.util.VisibleForTesting;

public class BaseballCount {
    @VisibleForTesting
    int getStrike() {
        return strike;
    }

    @VisibleForTesting
    int getBall() {
        return ball;
    }

    private int strike = 0;
    private int ball = 0;

    public void strike() {
        this.strike += 1;
    }

    public void ball() {
        this.ball += 1;
    }

    public boolean isCorrect() {
        return strike == 3;
    }

    @Override
    public String toString() {
        if (ball == 0 && strike == 0)
            return "낫싱";

        StringBuilder sb = new StringBuilder();
        if (ball > 0)
            sb.append(ball).append("볼 ");

        if (strike > 0) {
            sb.append(strike).append("스트라이크 ");
        }

        return sb.toString().trim();
    }
}
