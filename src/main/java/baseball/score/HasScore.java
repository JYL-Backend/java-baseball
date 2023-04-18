package baseball.score;

public interface HasScore {
    void increaseStrike();

    void increaseBall();

    String getGenerateScoreMessage();
}
