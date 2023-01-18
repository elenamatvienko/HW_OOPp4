public class NotHasDriverLicense extends Exception {
    private Driver driver;

    public NotHasDriverLicense(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
