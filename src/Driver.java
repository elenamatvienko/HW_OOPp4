public class Driver <T extends Transport & Сompeting> {
    private String name;
    private String drivLicense;
    private int experience;

    public Driver(String name, String drivLicense, int experience) {
        this.name = name;
        this.drivLicense = drivLicense;
        this.experience = experience;
    }
    public void startMoving (T transport){

        System.out.println ("Водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " "
                + transport.getModel() + "и будет участвовать в заезде");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivLicense() {
        return drivLicense;
    }

    public void setDrivLicense(String drivLicense) {
        this.drivLicense = drivLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
