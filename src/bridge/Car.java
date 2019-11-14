package bridge;

public abstract class Car {
    Bridge bridge;
    Car (Bridge bridge){
        this.bridge = bridge;
    }
    public abstract void drive();
}
