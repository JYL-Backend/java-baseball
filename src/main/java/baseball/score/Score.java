package baseball.score;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Score implements HasScore{
    int ballCount;
    int strikeCount;

    public Score() {
        this.ballCount = 0;
        this.strikeCount = 0;
    }

    @Override
    public void increaseStrike() {
        this.strikeCount++;
    }

    @Override
    public void increaseBall() {
        this.ballCount++;
    }

    @Override
    public String getGenerateScoreMessage() {
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
        return result.stream().collect(Collectors.joining(" "));
    }
}
