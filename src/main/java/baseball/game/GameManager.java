package baseball.game;

import baseball.scorecalculate.ScoreCalculatable;
import baseball.user.CanAttackUser;
import baseball.user.User;
import camp.nextstep.edu.missionutils.Console;

public class GameManager implements ManagableGame {
    private CanAttackUser user1;
    private User user2;
    private ScoreCalculatable scoreCalculatable;
    public GameManager(CanAttackUser user1, User user2, ScoreCalculatable scoreCalculatable) {
        this.user1 = user1;
        this.user2 = user2;
        this.scoreCalculatable = scoreCalculatable;

    }

    @Override
    public void start() {
        while (true){
            System.out.println("숫자 야구 게임을 시작합니다");
            while(true){
                System.out.println("숫자를 입력해주세요 : ");
                String resultMessage = user1.attack(user2, scoreCalculatable, Console.readLine());
                System.out.println(resultMessage);
                if(resultMessage.equals(String.format("%s스트라이크", user1.getNumber().length()))){
                    break;
                }
            }
            if(!endGameAndQuestionReplay()){
                break;
            }
        }
    }

    private boolean endGameAndQuestionReplay() {
        System.out.println(String.format("%s개의 숫자를 모두 맞히셨습니다! 게임 종료", user1.getNumber().length()));
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if(input.equals("1")){
            return true;
        }
        if(input.equals("2")){
            return false;
        }
        throw new IllegalArgumentException();
    }
}
