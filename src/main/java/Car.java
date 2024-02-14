import java.util.concurrent.ThreadLocalRandom;

public class Car {

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void moveCar() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomNumber = random.nextInt(10);
        if (randomNumber >= 4) {
            distance++;
        }
        if (distance < 0) {
            throw new IllegalArgumentException("이동 거리는 음수가 될 수 없습니다.");
        }
    }
}