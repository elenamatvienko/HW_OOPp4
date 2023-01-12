import java.util.Arrays;

public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }
}


