package baseball;

import baseball.game.GameManager;
import baseball.game.ManagableGame;
import baseball.random.RandomNumberGenerator;
import baseball.random.Randomize;
import baseball.scorecalculate.ScoreCalucator;
import baseball.user.ComputerUser;
import baseball.user.HumanUser;
import baseball.validator.Validator;

public class Application {
    public static void main(String[] args) {
        Randomize randomize = new RandomNumberGenerator(3);
        ManagableGame gameManager = new GameManager(
                new HumanUser(randomize.getRandomNumber()),
                new ComputerUser(randomize.getRandomNumber()),
                new ScoreCalucator(),
                new Validator(3),
                randomize
        );

        gameManager.start();
    }
}
