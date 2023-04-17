package baseball.scorecalculate;

import baseball.user.ComputerUser;
import baseball.user.HumanUser;
import baseball.user.User;
import baseball.validator.Validatable;
import baseball.validator.Validator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreCalcuatableTest {
    @Test
    public void 스트라이크3() {
        // given
        User human = new HumanUser("123");
        User computer = new ComputerUser("123");
        ScoreCalculatable scoreCalculatable = new ScoreCalucator();
        String inputString = "123";

        // when
        String calculate = scoreCalculatable.calculate(computer.getNumber(), inputString);

        // then
        Assertions.assertThat(calculate).isEqualTo("3스트라이크");
    }

    @Test
    public void 낫싱() {
        // given
        User computer = new ComputerUser("123");
        ScoreCalculatable scoreCalculatable = new ScoreCalucator();
        String inputString = "456";

        // when
        String calculate = scoreCalculatable.calculate(computer.getNumber(), inputString);

        // then
        Assertions.assertThat(calculate).isEqualTo("낫싱");
    }
    @Test
    public void 볼1스트라이크2() {
        // given
        User human = new HumanUser("123");
        User computer = new ComputerUser("123");
        ScoreCalculatable scoreCalculatable = new ScoreCalucator();
        String inputString = "132";

        // when
        String calculate = scoreCalculatable.calculate(computer.getNumber(), inputString);

        // then
        Assertions.assertThat(calculate).isEqualTo("2볼 1스트라이크");
    }
}
