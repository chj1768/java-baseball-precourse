package baseball.domain;

import java.util.List;

public class BallCounter implements BaseballCounter<List<Integer>> {
    @Override
    public void count(List<Integer> offenseScore, List<Integer> defenceScore, BaseballCount count) {
        for (int i = 0; i < offenseScore.size(); i++) {
            countBall(offenseScore.get(i), defenceScore, count, i);
        }
    }

    private void countBall(Integer offenseScoreItem, List<Integer> defenceScore, BaseballCount count, int offenseItemIndex) {
        if (defenceScore.contains(offenseScoreItem) && defenceScore.indexOf(offenseScoreItem) != offenseItemIndex)
            count.ball();
    }

}
