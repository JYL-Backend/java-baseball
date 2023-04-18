package baseball.game;

public enum GameMessage {
    START_NOW("숫자 야구 게임을 시작합니다"),
    PLEASE_ENTER_NUMBER("숫자를 입력해주세요 : "),
    CONVERSION_STRIKE("%s스트라이크"),
    CONVERSION_GAME_END("%s개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    PLEASE_SELECT_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    ;

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
