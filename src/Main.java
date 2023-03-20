public class Main {
    public static void main(String[] args) {


        Car car3 = new Car("car3", 4);
        Car car4 = new Car("car4", 4);

        Truck truck3 = new Truck("truck3", 6);
        Truck truck4 = new Truck("truck4", 8);

        Bicycle bicycle3 = new Bicycle("bicycle3", 2);
        Bicycle bicycle4 = new Bicycle("bicycle4", 2);



        ServiceStation station = new ServiceStation();
        station.check(car3);
        station.check(car4);
        station.check(truck3);
        station.check(truck4);
        station.check(bicycle3);
        station.check(bicycle4);


    }

}