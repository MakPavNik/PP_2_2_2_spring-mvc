package web.model;


public class Car {
    private String model;
    private String color;
    private int factoryNumber;

    public Car(String model, String color, int factoryNumber) {
        this.model = model;
        this.color = color;
        this.factoryNumber = factoryNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(int factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", factoryNumber=" + factoryNumber +
                '}';
    }
}
