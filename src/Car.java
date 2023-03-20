public class Car extends Vehicle implements MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }
}
