package baseball.domain;

import java.util.ArrayList;
import java.util.List;

class Offense implements BaseballPlayer<List<Integer>> {
    private final List<Integer> score;

    Offense(String input) {
        this.score = getScore(input);
    }

    @Override
    public List<Integer> play() {
        return score;
    }

    private List<Integer> getScore(String input) {
        validate(input);
        List<Integer> score = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            validate(input.charAt(i), score);
            score.add(input.charAt(i) - 48);
        }
        return score;
    }

    private void validate(String input) {
        if (input == null || input.length() != 3)
            throw new IllegalArgumentException();
    }

    private void validate(char t, List<Integer> score) {
        if (t - '0' < 1 || t - '0' > 9)
            throw new IllegalArgumentException();

        if (score.contains(t - '0'))
            throw new IllegalArgumentException();
    }
}
