package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PlateUmpire {
    private final List<BaseballCounter<List<Integer>>> counters;

    PlateUmpire(BaseballCounter<List<Integer>>... counter) {
        counters = new ArrayList<>(Arrays.asList(counter));
    }

    BaseballCount count(BaseballPlayer<List<Integer>> offense, BaseballPlayer<List<Integer>> defence) {
        BaseballCount baseballCount = new BaseballCount();
        for (BaseballCounter<List<Integer>> counter : counters) {
            counter.count(offense.play(), defence.play(), baseballCount);
        }
        return baseballCount;
    }
}
