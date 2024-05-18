package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        initCars();
    }

    @Override
    public void initCars() {
        carList.add(new Car("motor V4", "red", 300));
        carList.add(new Car("motor V6", "black", 500));
        carList.add(new Car("motor V8", "white", 700));
        carList.add(new Car("motor V6", "grey", 450));
        carList.add(new Car("motor V4", "blue", 320));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5 && count != 0) {
            return carList.subList(0, count);
        }
        return carList;
    }
}
