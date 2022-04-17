package baseball.domain;

import java.util.List;
import java.util.Objects;

public class Session {
    private String status = "1";
    private BaseballPlayer<List<Integer>> defence = new Defence();

    public void setStatus(String status) {
        this.status = status;
        if (!isOut())
            defence = new Defence();
    }

    public boolean isOut() {
        return Objects.equals(this.status, "2");
    }

    public BaseballPlayer<List<Integer>> getDefence() {
        return this.defence;
    }
}
