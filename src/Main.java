import java.util.*;

public class Main {

    public static void main(String[] args) {

        DriverB driverB1 = new DriverB("Алиев Денис Витальевич", true, 5);
        DriverB driverB2 = new DriverB("Андреев Борис Евгеньевич", false, 6);
        DriverB driverB3 = new DriverB("Фродлов Денис Игоревич", true, 5);
        DriverB driverB4 = new DriverB("Денисов Денис Витальевич", true, 6);

        Car car1 = new Car("Lada ", "Granta", 1.7, driverB1, BodyType.SEDAN);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB2, BodyType.HATCHBACK);
        Car car3 = new Car("BMW", "Z8", 3.0, driverB3, BodyType.CROSSOVER);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB4, null);

        DriverC driverC1 = new DriverC("Ильин Александр Валерьевич",true , 7);
        DriverC driverC2 = new DriverC("Александров Валерий Ильч", false, 8);
        DriverC driverC3 = new DriverC("Валерьев Илья Александрович", true, 7);
        DriverC driverC4 = new DriverC("Ильин Валерий Александрович", true, 8);

        Truck truck1 = new Truck("КамАЗ", "54901", 12, driverC1, LoadCapacity.CAPACITY_BIG);
        Truck truck2 = new Truck("JAC", "Sunray", 10, driverC2, LoadCapacity.CAPACITY_AVERAGE);
        Truck truck3 = new Truck("Валдай", "NEXT", 11, driverC3, LoadCapacity.CAPACITY_SMALL);
        Truck truck4 = new Truck("Sollers", "Argo", 10, driverC4, null);

        DriverD driverD1 = new DriverD("Васильев Егор Дмитриевич", true, 9);
        DriverD driverD2 = new DriverD("Егоров Василий Дмитриевич", false, 10);
        DriverD driverD3 = new DriverD("Дмитриев Василй Егорович", true, 9);
        DriverD driverD4 = new DriverD("Васильев Дмитрий Егорович", true, 10);


        Bus bus1 = new Bus("Ikarus ", "280", 11, driverD1, null);
        Bus bus2 = new Bus("Scania ", "Citywide", 10, driverD2, Capacity.SMALL);
        Bus bus3 = new Bus("MAN", "Lion's Coach", 11, driverD3, Capacity.LARGE);
        Bus bus4 = new Bus("ПАЗ", "3205", 10, driverD4, Capacity.MEDIUM);

       /* Transport.printInfo(car1);
        Transport.printInfo(car2);
        Transport.printInfo(car3);
        Transport.printInfo(car4);
        System.out.println();
        Transport.printInfo(truck1);
        Transport.printInfo(truck2);
        Transport.printInfo(truck3);
        Transport.printInfo(truck4);
        System.out.println();
        Transport.printInfo(bus1);
        Transport.printInfo(bus2);
        Transport.printInfo(bus3);
        Transport.printInfo(bus4);
        System.out.println();

        passDiagnostics(car1, truck3, bus2);
        System.out.println();
        takeDriversLicense(driverB1, driverB2, driverC1, driverC2, driverD1, driverD2);*/

        Mechanic<Car>antonAntonovich = new Mechanic<>("Антон Антонович Антонов", "Автосервис",
                "Легковые автомобили");
        Mechanic<Bus>borisBorisovich = new Mechanic<>("Борис Борисович Борисов","Ремонт автобусов",
                "Автобусы");
        Mechanic<Truck>egorEgorovich = new Mechanic<>("Егор Егорович Егоров", "Ремонт грузовиков",
                "Грузовые автомобили");

        /*antonAntonovich.addTechnic(car1);
        antonAntonovich.performMaintenance();
        antonAntonovich.addTechnic(car3);
        antonAntonovich.repairOfEquipment();
        System.out.println();
        borisBorisovich.addTechnic(bus1);
        borisBorisovich.performMaintenance();
        borisBorisovich.addTechnic(bus4);
        borisBorisovich.repairOfEquipment();
        System.out.println();
        egorEgorovich.addTechnic(truck1);
        egorEgorovich.performMaintenance();
        egorEgorovich.addTechnic(truck3);
        egorEgorovich.repairOfEquipment();
        System.out.println();

        car1.addDriver(driverB1);
        bus1.addDriver(driverD1);
        truck1.addDriver(driverC1);*/
        Mechanic mechanic1 = new Mechanic<>("Антон Антонович Антонов", "Автосервис",
                "Легковые автомобили");
        Mechanic mechanic2 = new Mechanic("Борис Борисович Борисов","Ремонт автобусов",
                "Автобусы");
        Mechanic mechanic3 = new Mechanic("Егор Егорович Егоров", "Ремонт грузовиков",
                "Грузовые автомобили");
     /*   System.out.println("У автомобиля " + car1.getBrand()+ " " + car1.getModel() + " водитель: " + driverB1.getName() +
                ", механик: " + mechanic1.getName());
        System.out.println("У автобуса " + bus1.getBrand()+ " " + bus1.getModel() + " водитель: " + driverD1.getName() +
                ", механик: " + mechanic2.getName());
        System.out.println("У грузовика " + truck1.getBrand()+ " " + truck1.getModel() + " водитель: " + driverC1.getName() +
                ", механик: " + mechanic3.getName());*/

       /* Map<Transport, Mechanic> mechanic = new HashMap<>();
        mechanic.put(car1, mechanic2);
        mechanic.put(car1, mechanic1);
        mechanic.put(car2, mechanic3);
        mechanic.put(car2, mechanic1);
        mechanic.put(truck1, mechanic1);
        mechanic.put(truck1, mechanic3);
        mechanic.put(bus1, mechanic3);
        mechanic.put(bus1, mechanic2);

        System.out.println(mechanic);*/

        Set<String> set = new HashSet<>();
        set.add("Антон Антонович Антонов");
        set.add("Борис Борисович Борисов");
        set.add("Егор Егорович Егоров");
        set.add("Антон Антонович Антонов");
        set.add("Егор Егорович Егоров");
        set.add("Борис Борисович Борисов");
        set.add("Борис Борисович Борисов");
        set.add("Егор Егорович Егоров");
        System.out.println(set);

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){

        System.out.println(iter.next());
        }

    }
    public static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());


            }
        }
    }

    public static void takeDriversLicense(Driver... drivers) {
        for (Driver driver : drivers) {
            try {
                driver.takeDriversLicense();
            } catch (NotHasDriverLicense e) {
                System.out.println("Произошла ошибка с водителем " + e.getDriver().getName());
                System.out.println(e.getMessage());
            }
        }
    }

}






