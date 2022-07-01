public class Main {
    public static void main(String[] args) {
        // Create an instance of Garage and add cars to it
        Garage garage = new Garage();
        Car mazda = new Car("Mazda");
        Car volkswagen = new Car("Volkswagen");

        garage.addCars(mazda);
        garage.addCars(volkswagen);

        System.out.println(garage);
    }
}
