package bridge;

public class BridgeTest {
    public static void main(String[] args) {

        Car car = new AudiCar(new CarBridge());
        car.drive();
        Bus bus = new AudiBus(new BusBridge());
        bus.drive();

    }
}

class AudiCar extends Car{

    public AudiCar(Bridge bridge) {
        super(bridge);
    }

    @Override
    public void drive() {
        System.out.println("Drive Audi car");
    }
}

class AudiBus extends Bus{

    public AudiBus(Bridge bridge) {
        super(bridge);
    }

    @Override
    public void drive() {
        System.out.println("Drive Audi bus");
    }
}
