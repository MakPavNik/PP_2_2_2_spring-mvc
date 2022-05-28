package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Lada", "Red", 1001));
        list.add(new Car("Niva", "Black", 1002));
        list.add(new Car("Kamaz", "Green", 1003));
        list.add(new Car("Opel", "White", 1004));
        list.add(new Car("BMV", "Grey", 1005));

        if (count == null || count < 1) {
            return list;
        } else {
            return list.stream().limit(count).toList();
        }
    }
}
