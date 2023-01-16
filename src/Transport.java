import java.util.Arrays;

public abstract class Transport <T extends Driver> implements Сompeting {

    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
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
        if (engineVolume<= 0){
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMoving();

    public abstract void finishMovement ();

    @Override
    public String toString() {
        return brand + " " + model + " " + "engineVolume = " + engineVolume;
    }
    public static void printInfo(Transport transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " +
                transport.getBrand()  + " и будет участвовать в заезде");
    }
    public abstract void printType();

}



