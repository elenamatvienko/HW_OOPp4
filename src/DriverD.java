public class DriverD extends Driver{
    public DriverD(String name, boolean hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " заправил автобус");
    }
}
