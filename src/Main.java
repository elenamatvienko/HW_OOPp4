import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada ", "Granta", 1.7, Car.BodyType.SEDAN);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.HATCHBACK);
        Car car3 = new Car("BMW", "Z8", 3.0, Car.BodyType.SUV);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, Car.BodyType.MINIVAN);

        System.out.println(car1);
        System.out.println(Car.BodyType.SEDAN);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println();


        Truck truck1 = new Truck("КамАЗ", "54901", 12, Truck.LoadCapacity.N1);
        Truck truck2 = new Truck("JAC", "Sunray", 10, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Валдай", "NEXT", 11, Truck.LoadCapacity.N3);
        Truck truck4 = new Truck("Sollers", "Argo", 10, Truck.LoadCapacity.N1);

        System.out.println(truck1);
        System.out.println();
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        System.out.println();

        Bus bus1 = new Bus("Ikarus ", "280", 11, Bus.Capacity.ESPECIALLY_SMALL);
        Bus bus2 = new Bus("Scania ", "Citywide", 10, Bus.Capacity.BIG);
        Bus bus3 = new Bus("MAN", "Lion's Coach", 11, Bus.Capacity.AVERAGE);
        Bus bus4 = new Bus("ПАЗ", "3205", 10, Bus.Capacity.ESPECIALLY_BIG);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        System.out.println();

        Driver <Car> denis = new Driver<>("Алиев Денис Витальевич", "B", 5);
        Driver <Truck> alex = new Driver<>("Ильин Александр Валерьевич", "C",7);
        Driver <Bus> egor = new Driver<>("Васильев Егор Дмитриевич", "D", 9);

        denis.startMoving (car1);
        alex.startMoving(truck2);
        egor.startMoving(bus3);


    //    checkСompeting (car1, car2, car3, car4, truck1, truck2, truck3, truck4, bus1, bus2, bus3, bus4);

    }
    public static void checkСompeting(Сompeting... transport) {
        for (Сompeting transports : transport) {
            for (String result : transports.getСompetingResult()) {
                transports.receivedResult(result);
            }
        }
    }

}