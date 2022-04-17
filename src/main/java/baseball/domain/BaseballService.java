package baseball.domain;

public class BaseballService {
    private final PlateUmpire plateUmpire = new PlateUmpire(new BallCounter(), new StrikeCounter());

    public BaseballCount play(String input, Session session) {
        return plateUmpire.count(new Offense(input), session.getDefence());
    }
}
