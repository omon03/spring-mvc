package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DaoCar {

    private final int COUNT_CAR = 5;
    private final List<Car> cars = new ArrayList<>();

    {
        for (int i = 1; i <= COUNT_CAR; i++) {
            cars.add( new Car(i, "S", i * 100) );
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getListCars(int count) {
        if (0 == count) {
            return Collections.emptyList();
        }
        return (1 <= count && COUNT_CAR > count)
                ? getCars().stream().limit(count).collect(Collectors.toList())
                : getCars();
    }
}
