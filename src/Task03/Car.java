package Task03;

public class Car {

    private String color;
    private String name;
    private double weight;

    public Car() {}

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public void printCarInfo() {
        System.out.println("Car: " + name + ", Color: " + color + ", Weight: " + weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


