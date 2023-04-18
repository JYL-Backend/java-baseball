package baseball.validator;

public class Validator implements Validatable {
    int size;
    public Validator(int size) {
        this.size = size;
    }

    @Override
    public void validate(String number, String input) {
        try {
            Integer.parseInt(input);
            Integer.parseInt(number);
        } catch (Exception ex){
            throw new IllegalArgumentException();
        }
        if(number.length() != input.length() || input.length() != size){
            throw new IllegalArgumentException();
        }
    }
}
