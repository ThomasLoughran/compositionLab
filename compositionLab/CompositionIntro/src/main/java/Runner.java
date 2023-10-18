import air.JetEngine;
import air.Plane;
import products.Product;
import vehicles.*;

public class Runner {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));

        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(
                200,
                120,
                new Product(10000, 3, "2015 La Ferrari"),
                new Engine(100, 350));
        car.startEngine();
        Engine betterEngine = new Engine(300, 500);
        car.setEngine(betterEngine);
        System.out.println(car.getHp());

        SpeedBoat speedBoat = new SpeedBoat(200,5, new Product(350, 5, "abc"), "wood", new Motor(2, 3));
        System.out.println(speedBoat.getFuel());

        Plane plane = new Plane(1000, 200, new Product(10000, 1, "Midge"), new JetEngine(300, 700), "Tom Cruise", 2);
        System.out.println(plane.getHp());

    }

}
