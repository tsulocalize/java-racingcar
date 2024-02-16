package racingcar.domain;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    private RandomGenerator() {
    }

    public static int getRandomNumberUnder(int upperBound) {
        return random.nextInt(upperBound);
    }
}
