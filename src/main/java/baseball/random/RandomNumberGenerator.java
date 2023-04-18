package baseball.random;

import camp.nextstep.edu.missionutils.Randoms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomNumberGenerator implements Randomize{

    int size;

    public RandomNumberGenerator(int size) {
        this.size = size;
    }

    @Override
    public String getRandomNumber() {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(Randoms.pickNumberInRange(1, 9));
        }
        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
