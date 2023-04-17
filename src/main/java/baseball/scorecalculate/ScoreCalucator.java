package baseball.scorecalculate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreCalucator implements ScoreCalculatable {
    @Override
    public String calculate(String number, String inputString) {
        if(number.equals(inputString)) {
            return String.format("%s스트라이크", number.length());
        }

        int strikeCount = 0;
        int ballCount = 0;
        Map<Character, Integer> indexMap = getIndexMap(number);

        for(int i=0; i<inputString.length(); i++){
            char c = inputString.charAt(i);
            if(!indexMap.containsKey(c)) { // 없음
                continue;
            }
            Integer findIndex = indexMap.get(c);
            if(i == findIndex) { // 스트라이크
                strikeCount++;
                continue;
            }
            ballCount++; //볼
        }

        return getMessage(ballCount, strikeCount);
    }

    private String getMessage(int ballCount, int strikeCount) {
        ArrayList<String> result = new ArrayList<>();
        if(ballCount != 0){
            result.add(String.format("%s볼", ballCount));
        }
        if(strikeCount != 0){
            result.add(String.format("%s스트라이크", strikeCount));
        }
        if(result.size() == 0){
            return "낫싱";
        }
        return String.join(" ",result);
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
