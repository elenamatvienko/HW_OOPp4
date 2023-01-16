import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        DriverB driverB1 = new DriverB("Алиев Денис Витальевич", true, 5);
        DriverB driverB2 = new DriverB("Андреев Борис Евгеньевич", true, 6);
        DriverB driverB3 = new DriverB("Фродлов Денис Игоревич", true, 5);
        DriverB driverB4 = new DriverB("Денисов Денис Витальевич", true, 6);

        Car car1 = new Car("Lada ", "Granta", 1.7, driverB1);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverB2);
        Car car3 = new Car("BMW", "Z8", 3.0, driverB3);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, driverB4);

        DriverC driverC1 = new DriverC("Ильин Александр Валерьевич", true, 7);
        DriverC driverC2 = new DriverC("Александров Валерий Ильч", true, 8);
        DriverC driverC3 = new DriverC("Валерьев Илья Александрович", true, 7);
        DriverC driverC4 = new DriverC("Ильин Валерий Александрович", true, 8);

        Truck truck1 = new Truck("КамАЗ", "54901", 12, driverC1);
        Truck truck2 = new Truck("JAC", "Sunray", 10, driverC2);
        Truck truck3 = new Truck("Валдай", "NEXT", 11, driverC3);
        Truck truck4 = new Truck("Sollers", "Argo", 10, driverC4);

        DriverD driverD1 = new DriverD("Васильев Егор Дмитриевич", true, 9);
        DriverD driverD2 = new DriverD("Егоров Василий Дмитриевич", true, 9);
        DriverD driverD3 = new DriverD("Дмитриев Василй Егорович", true, 9);
        DriverD driverD4 = new DriverD("Васильев Дмитрий Егорович", true, 9);

        Bus bus1 = new Bus("Ikarus ", "280", 11, driverD1);
        Bus bus2 = new Bus("Scania ", "Citywide", 10, driverD2);
        Bus bus3 = new Bus("MAN", "Lion's Coach", 11, driverD3);
        Bus bus4 = new Bus("ПАЗ", "3205", 10, driverD4);

        Transport.printInfo(car1);
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
    }

}





