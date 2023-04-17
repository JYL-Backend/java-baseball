package baseball.random;

import camp.nextstep.edu.missionutils.Randoms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomNumberGenerator implements Randomize{

    @Override
    public String getRandomNumber(int size) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(Randoms.pickNumberInRange(1, 9));
        }
        return String.join("",list.stream().map(String::valueOf).collect(Collectors.toList()));
    }
}
