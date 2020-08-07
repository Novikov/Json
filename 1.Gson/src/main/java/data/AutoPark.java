package data;

import java.util.LinkedList;
import java.util.List;

public class AutoPark {
     List<Car> cars = new LinkedList<>();

     public List<Car> getCars() {
          return cars;
     }

     public void addCar(Car car) {
          this.cars.add(car);
     }
}
