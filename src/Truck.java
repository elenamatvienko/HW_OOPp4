public class Truck extends Transport <DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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


}
