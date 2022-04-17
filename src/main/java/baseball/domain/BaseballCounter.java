package baseball.domain;

interface BaseballCounter<T> {
    void count(T offenseScore, T defenceScore, BaseballCount score);
}


