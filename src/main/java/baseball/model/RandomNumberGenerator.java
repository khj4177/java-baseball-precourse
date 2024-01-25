package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    private final int RANDOM_NUMBER_LENGTH = 3;
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 9;
    private List<String> randomNumber;

    public void generateRandomNumber() {
        randomNumber = new ArrayList<String>();
        while (randomNumber.size() < RANDOM_NUMBER_LENGTH) {
            String number = Integer.toString(Randoms.pickNumberInRange(MIN_NUM, MAX_NUM));
            if (!randomNumber.contains(number)) {
                randomNumber.add(number);
            }
        }
    }

    public String getRandomNumber() {
        return String.join("", randomNumber);
    }
}
