package baseball.validator;

public class Validator implements Validatable {
    @Override
    public void validate(String number, String input) {
        if(number == null || input == null){
            throw new IllegalArgumentException();
        }
        if(number.length() == 0 || input.length() == 0){
            throw new IllegalArgumentException();
        }
        if(number.length() != input.length()){
            throw new IllegalArgumentException();
        }
        String regex = "^[0-9]+$";

        if (!number.matches(regex)){
            throw new IllegalArgumentException();
        }
        if (!input.matches(regex)){
            throw new IllegalArgumentException();
        }
    }
}
