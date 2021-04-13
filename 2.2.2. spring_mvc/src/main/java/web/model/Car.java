package web.model;

import java.util.Objects;

public class Car {
    private long id;
    private String model;
    private int maxSpeed;

    public Car(long id, String model, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() && getMaxSpeed() == car.getMaxSpeed() && getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
