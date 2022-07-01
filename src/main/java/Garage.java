import java.util.List;
import java.util.ArrayList;

public class Garage {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(int index, Car car) {
        cars.set(index, car);
        System.out.println("Car has been set!");
    }

    public void addCars(Car car) {
        this.cars.add(car);
        System.out.println("Car has been added");
    }

    public String toString() {
        return "Garage=" + cars;
    }
}
