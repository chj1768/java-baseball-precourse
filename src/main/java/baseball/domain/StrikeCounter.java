package baseball.domain;

import java.util.List;
import java.util.Objects;

class StrikeCounter implements BaseballCounter<List<Integer>> {
    @Override
    public void count(List<Integer> offenseScore, List<Integer> defenceScore, BaseballCount count) {
        for (int i = 0; i < defenceScore.size(); i++) {
            countStrike(offenseScore.get(i), defenceScore.get(i), count);
        }
    }

    private void countStrike(Integer offenseScoreItem, Integer defenceScoreItem, BaseballCount count) {
        if (Objects.equals(offenseScoreItem, defenceScoreItem))
            count.strike();
    }

}
