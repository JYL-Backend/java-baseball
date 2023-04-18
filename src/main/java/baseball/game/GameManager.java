package baseball.game;

import baseball.random.Randomize;
import baseball.scorecalculate.ScoreCalculatable;
import baseball.scorecalculate.ScoreCalucator;
import baseball.user.ComputerUser;
import baseball.user.HumanUser;
import baseball.user.User;
import baseball.validator.Validatable;
import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;

public class GameManager implements ManagableGame {
    private User user1;
    private User user2;
    private ScoreCalculatable scoreCalculatable;
    private Validatable validatable;
    private Randomize randomize;
    public GameManager(HumanUser user1, ComputerUser user2, ScoreCalucator scoreCalculatable, Validator validator, Randomize randomize) {
        this.user1 = user1;
        this.user2 = user2;
        this.scoreCalculatable = scoreCalculatable;
        this.validatable = validator;
        this.randomize = randomize;
    }
    @Override
    public void start() {
        while (true){
            if(!play()){
                break;
            }
            user2.changeNumber(randomize.getRandomNumber());
        }
    }

    private boolean play(){
        System.out.println(GameMessage.START_NOW);
        while(true){
            System.out.println(GameMessage.PLEASE_ENTER_NUMBER);
            String input = Console.readLine();
            validatable.validate(user2.getNumber(),input);
            String resultMessage = scoreCalculatable.calculate(user2.getNumber(), input);
            System.out.println(resultMessage);
            if(resultMessage.equals(String.format(GameMessage.CONVERSION_STRIKE.toString(), user1.getNumber().length()))){
                break;
            }
        }
        return endGameAndQuestionReplay();
    }

    private boolean endGameAndQuestionReplay() {
        System.out.println(String.format(GameMessage.CONVERSION_GAME_END.toString(), user1.getNumber().length()));
        System.out.println(GameMessage.PLEASE_SELECT_RESTART);
        String input = Console.readLine();
        if(input.equals("1")){
            return true;
        }
        if(input.equals("2")){
            return false;
        }
        throw new IllegalArgumentException();
    }
}
