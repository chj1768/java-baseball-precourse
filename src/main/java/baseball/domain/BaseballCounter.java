package baseball.domain;

public interface BaseballCounter<T> {
    void count(T offenseScore, T defenceScore, BaseballCount score);
}


