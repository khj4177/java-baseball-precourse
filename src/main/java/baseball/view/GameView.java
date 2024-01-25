package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class GameView {

    public String predict() {
        System.out.print("숫자를 입력해주세요 : ");

        return Console.readLine();
    }

    public void result(int ball, int strike) {
        String ballStr = (ball > 0) ? ball+"볼" : "";
        String strikeStr = (strike > 0) ? strike+"스트라이크": "";

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        } else if (strike == 0 || ball == 0) {
            System.out.println(ballStr + strikeStr);
        } else {
            System.out.println(ballStr + " " + strikeStr);
        }
    }

    public String exit() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return Console.readLine();
    }
}
