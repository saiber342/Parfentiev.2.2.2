package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private List<Car> list = addCars();


    public List<Car> addCars() {

        Car car1 = new Car(23321300, "1a", 3);
        Car car2 = new Car(5345232, "634f", 4);
        Car car3 = new Car(123123, "23f", 12);
        Car car4 = new Car(725435232, "4vvx", 3);
        Car car5 = new Car(8212332, "8vf", 7);

        list = new ArrayList();

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }


    public List<Car> getCars(int count) {
        List<Car> countList = new ArrayList<>();
        for (int i=0; i < count; i++) {
            if (count >= 5) {
                countList = list;
                break;
            }
            countList.add(list.get(i));
        }
        return countList;
    }
}
