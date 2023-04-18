package baseball.user;

import baseball.scorecalculate.ScoreCalculatable;

public class ComputerUser implements User {
    String number;
    public ComputerUser(String number) {
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
