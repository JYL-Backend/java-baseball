package baseball;

import baseball.game.GameManager;
import baseball.game.ManagableGame;
import baseball.random.RandomNumberGenerator;
import baseball.random.Randomize;
import baseball.scorecalculate.ScoreCalucator;
import baseball.user.ComputerUser;
import baseball.user.HumanUser;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Randomize randomize = new RandomNumberGenerator();
        ManagableGame gameManager = new GameManager(
                new HumanUser(randomize.getRandomNumber(3)),
                new ComputerUser(randomize.getRandomNumber(3)),
                new ScoreCalucator()
        );

        gameManager.start();
    }
}
