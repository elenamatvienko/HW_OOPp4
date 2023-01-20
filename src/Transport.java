import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
    private List<Transport> transports = new ArrayList<>();
    private List<Driver>drivers = new ArrayList<>();
    private List<Mechanic>mechanics = new ArrayList<>();

    public Transport(List<Transport> transports, List<Driver> drivers, List<Mechanic> mechanics) {
        this.transports = transports;
        this.drivers = drivers;
        this.mechanics = mechanics;
    }
    void addTransport(Transport transport){
        transports.add(transport);
    }
    void addMechanic (Mechanic mechanic) {
        mechanics.add(mechanic);
    }
    void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
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

    public abstract void passDiagnostics();

    public static void printInfo(Transport transport){

        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " +
                transport.getBrand()  + " и будет участвовать в заезде");
    }
    public abstract  void printType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", transports=" + transports +
                ", drivers=" + drivers +
                ", mechanics=" + mechanics +
                '}';
    }
}



