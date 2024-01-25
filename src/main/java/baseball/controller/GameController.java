package baseball.controller;

import baseball.model.AnswerChecker;
import baseball.model.GameExitChecker;
import baseball.model.RandomNumberGenerator;
import baseball.view.GameView;

public class GameController {
    private final GameView gameView = new GameView();
    private final AnswerChecker answerChecker = new AnswerChecker();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final GameExitChecker gameExitChecker = new GameExitChecker();

    public void run() {
        while (!gameExitChecker.getExit()) {
            randomNumberGenerator.generateRandomNumber();
            answerChecker.reset();
            processGame();
            gameExitChecker.setExit(gameView.exit());
        }
    }

    private void processGame() {
        while (!answerChecker.isAnswer()) {
            answerChecker.checkAnswer(randomNumberGenerator.getRandomNumber(), gameView.predict());
            gameView.result(answerChecker.getBall(), answerChecker.getStrike());
        }
    }
}
