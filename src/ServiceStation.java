import java.util.Random;

public class ServiceStation {
    public void check(Car car) {
        checkVehicle(car);
        checkEngine(car);
    }

    public void check(Truck truck) {
        checkVehicle(truck);
        checkEngine(truck);
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        checkVehicle(bicycle);
        }

    public void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
    private void checkEngine (MotorTransport motorTransport){
        motorTransport.checkEngine();
    }
}