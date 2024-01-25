package baseball.model;

public class GameExitChecker {
    private final String EXIT_STR = "2";
    private final String CONTINUE_STR = "1";
    private boolean exit = false;

    public void setExit(String input) {
        if (input.equals(EXIT_STR)) {
            exit = true;
        } else if (input.equals(CONTINUE_STR)) {
            exit = false;
        } else {
            throw new IllegalArgumentException("잘못된 값을 입력했습니다.");
        }
    }

    public boolean getExit() {
        return exit;
    }

}
