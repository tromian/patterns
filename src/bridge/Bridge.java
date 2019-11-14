package bridge;

public interface Bridge {
    void drive();
}

class CarBridge implements Bridge {

    @Override
    public void drive() {

    }
}
class BusBridge implements Bridge{

    @Override
    public void drive() {

    }
}
