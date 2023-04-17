package baseball.validator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatableTest {
    @Test
    public void 통과() {
        // given
        String number = "123";
        String input = "123";
        Validatable validatable = new Validator();

        // when
        validatable.validate(number,input);
    }

    @Test
    public void 길이다름() {
        // given
        String number = "123";
        String input = "1232";
        Validatable validatable = new Validator();

        // when
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            validatable.validate(number, input);
        });
    }

    @Test
    public void 숫자아님() {
        // given
        String number = "123";
        String input = "12d";
        Validatable validatable = new Validator();

        // when
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            validatable.validate(number, input);
        });
    }
}
