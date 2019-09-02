package factory;

public class SimpleFactory {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Car bmw = factory.create("BMW");
        Car audi = factory.create("Audi");
        Car honda = factory.create("Honda");

        bmw.drive();
        audi.drive();
        honda.drive();

    }
}

interface Car {
    void drive();
}

class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Drive BMW");
    }
}
class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}
class Honda implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Honda");
    }
}


class Factory {
     public Car create(String model){
         switch (model){
             case "BMW": return new BMW();
             case "Audi": return new Audi();
             case "Honda": return new Honda();
             default: return null;
         }
     }
}