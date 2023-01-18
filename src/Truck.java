public class Truck extends Transport<DriverC> {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void startMoving() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    public void finishMovement() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }


    @Override
    public void pinStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void bestLapTime() {
        int minLevel = 40;
        int maxLevel = 90;
        int bestLapTimeMin = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Лучшее время круга для грузовика " + bestLapTimeMin + "минут");
    }

    @Override
    public void maximumSpeed() {
        int minLevel = 90;
        int maxLevel = 130;
        int maxSpeed = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed + " км/ч");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузоподъемность: от " + loadCapacity.getMinWeight() + "тонн до "
                    + loadCapacity.getMaxWeight() + "тонн");
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
    @Override
    public void passDiagnostics() {
        System.out.println("Грузовику " + getBrand() + " " + getModel() + " необходимо пройти диагностику");

    }
}
