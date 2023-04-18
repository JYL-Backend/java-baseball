package baseball.scorecalculate;

import baseball.score.Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreCalucator implements ScoreCalculatable {
    // TODO: 2023-04-18 Score 클래스 분리 
    @Override
    public String calculate(String number, String inputString) {
        if(number.equals(inputString)) {
            return String.format("%s스트라이크", number.length());
        }

        Map<Character, Integer> indexMap = getIndexMap(number);
        Score score = new Score();

        for(int i=0; i<inputString.length(); i++){
            char c = inputString.charAt(i);
            if(!indexMap.containsKey(c)) { // 없음
                continue;
            }
            Integer findIndex = indexMap.get(c);
            if(i == findIndex) {
                score.increaseStrike();
                continue;
            }
            score.increaseBall();
        }

        return score.getGenerateScoreMessage();
    }

    private Map<Character, Integer> getIndexMap(String number) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0 ; i<number.length(); i++) {
            char c = number.charAt(i);
            map.put(c,i);
        }
        return map;
    }
}
