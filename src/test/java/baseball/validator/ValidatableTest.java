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
        int size = 3;
        Validatable validatable = new Validator(3);

        // when
        validatable.validate(number,input);
    }

    // TODO: 2023-04-18 paramizetest 
    @Test
    public void 길이다름() {
        // given
        String number = "123";
        String input = "1232";
        int size = 3;
        Validatable validatable = new Validator(3);

        // when
        assertThrows(IllegalArgumentException.class, () -> {
            validatable.validate(number, input);
        });
    }

    @Test
    public void 숫자아님() {
        // given
        String number = "123";
        String input = "12d";
        int size = 3;
        Validatable validatable = new Validator(3);

        // when
        assertThrows(IllegalArgumentException.class, () -> {
            validatable.validate(number, input);
        });
    }
}
