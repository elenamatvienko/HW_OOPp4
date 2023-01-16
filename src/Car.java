public class Car extends Transport <DriverB>{


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }


    public void startMoving() {

        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    public void finishMovement() {

        System.out.println("Автомобиль марки " + getBrand() + " закончил вижение");
    }



    @Override
    public void pinStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minLevel = 20;
        int maxLevel = 40;
        int bestLapTimeMin = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Лучшее время круга для автомобиля " + bestLapTimeMin + "минут");
    }

    @Override
    public void maximumSpeed() {
        int minLevel = 120;
        int maxLevel = 180;
        int maxSpeed = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed + " км/ч");
    }

}


