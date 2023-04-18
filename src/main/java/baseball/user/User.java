package baseball.user;

import baseball.scorecalculate.ScoreCalculatable;

public interface User {
    String getNumber();
    void changeNumber(String number);
}
