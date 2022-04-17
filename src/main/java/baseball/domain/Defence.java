package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Defence implements BaseballPlayer<List<Integer>> {
    private final List<Integer> score;

    public Defence() {
        this.score = get();
    }

    @Override
    public List<Integer> play() {
        return score;
    }

    private List<Integer> get() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ints.add(Randoms.pickNumberInRange(1, 9));
        }
        return ints;
    }

}
