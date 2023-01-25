import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;;
    private int experience;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void takeDriversLicense() throws NotHasDriverLicense {
        System.out.println("У водителя " + getName() + " есть права");
    }
    public abstract void startMove() ;
    public abstract void finishMove();
    public abstract void refuel();


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", typeOfDriversLicense=" + hasDriverLicense +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

