public enum CarType {
    SMALL, SEDAN, LUXURY
}

public abstract class Car {
    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
    private void arrangeParts() {
    }
    protected abstract void construct();
    private CarType model = null;
    public CarType getModel() {
        return model;
    }
    public void setModel(CarType model) {
        this.model = model;
    }
}


public class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
    protected void construct() {
        System.out.println("Building small car");
    }
}

public class SedanCar extends Car {
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
    protected void construct() {
        System.out.println("Building sedan car");
    }
}
public class LuxuryCar extends Car {
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }
    protected void construct() {
        System.out.println("Building luxury car");
    }
}
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                break;
        }
        return car;
    }
}


public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
