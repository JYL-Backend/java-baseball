package baseball.user;

import baseball.scorecalculate.ScoreCalculatable;

public class HumanUser implements CanAttackUser {
    String number;

    public HumanUser(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String attack(User user, ScoreCalculatable scoreCalculator, String inputString) {
        return scoreCalculator.calculate(user.getNumber(), inputString);
    }
}
