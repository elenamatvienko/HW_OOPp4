public class Bus extends Transport <DriverD>{


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    public void finishMovement() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }




    @Override
    public void pinStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minLevel = 60;
        int maxLevel = 90;
        int bestLapTimeMin = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Лучшее время круга для автобуса " + bestLapTimeMin + "минут");
    }

    @Override
    public void maximumSpeed() {
        int minLevel = 90;
        int maxLevel = 120;
        int maxSpeed = (int) (minLevel + (maxLevel - minLevel) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed + " км/ч");
    }

  }
