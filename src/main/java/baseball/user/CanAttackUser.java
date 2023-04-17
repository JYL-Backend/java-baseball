package baseball.user;

import baseball.scorecalculate.ScoreCalculatable;

public interface CanAttackUser extends User {
    String attack(User enemyUser, ScoreCalculatable scoreCalculator, String inputString);
}
