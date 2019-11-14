package bridge;

public abstract class Bus {
    Bridge bridge;
    Bus (Bridge bridge){
        this.bridge = bridge;
    }
    public abstract void drive();
}
