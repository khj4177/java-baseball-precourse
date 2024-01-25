package baseball.model;

public class AnswerChecker {
    private int ball = 0;
    private int strike = 0;
    private boolean isAnswer = false;

    public void checkAnswer (String answer, String input) {
        predictionValidator(answer, input);
        reset();
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == input.charAt(i)) {
                strike++;
            } else if (answer.contains(Character.toString(input.charAt(i)))){
                ball++;
            }
        }
        isAnswer = strike == answer.length() && ball == 0;
    }

    private void predictionValidator(String answer, String input) {
        if (answer.length() != input.length()) {
            throw new IllegalArgumentException("잘못된 입력입니다. 길이가 다릅니다.");
        } else if (!input.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("잘못된 입력입니다. 숫자가 아닌 문자가 포함되어 있습니다.");
        }
    }

    public void reset() {
        ball = 0;
        strike = 0;
        isAnswer = false;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isAnswer() {
        return isAnswer;
    }
}