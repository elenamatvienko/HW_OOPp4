import java.util.Arrays;

public abstract class Transport implements Сompeting {
    public static final String RES_PS = "Пит-стоп";
    public static final String RES_BT = "Лучшее время круга";
    public static final String RES_MS = "Максимальная скорость";
    public static final String [] ALL_СOMPETING_RESULT = {RES_PS, RES_BT, RES_MS};

    private String [] competingResult = new String[3];

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMovement ();
    @Override
    public String[] getСompetingResult() {
        return ALL_СOMPETING_RESULT;
    }

    @Override
    public String[] getAllResult() {
        return competingResult;
    }

    @Override
    public void competing(String result) {
        competingResult = Arrays.copyOf(competingResult, competingResult.length + 1);
        competingResult [competingResult.length - 1] = result;

    }

    @Override
    public void receivedResult(String result) {
        switch (result) {
            case RES_PS:
                System.out.println(result);
                break;
            case RES_BT:
                System.out.println(result);
                break;
            case RES_MS:
                System.out.println(result);
                break;
            default:
                System.out.println("Нет такого показателя");
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + "engineVolume = " + engineVolume;
    }
    public abstract void printType();

}



