package baseball.user;

import baseball.random.Randomize;
import baseball.scorecalculate.ScoreCalculatable;

public class HumanUser implements User {
    String number;

    public HumanUser(String number) {
        this.number = number;
    }
    public void changeNumber(String number){
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }
}
