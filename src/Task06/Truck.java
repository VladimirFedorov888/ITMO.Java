package Task06;

public class Truck extends Car {
    public int wheelsCount;
    public int weight;

    public void newWheels(int count) {
        this.wheelsCount = count;
        System.out.println("Количество колес: " + wheelsCount);
    }

    public Truck(int weight, String model, char color, float speed, int wheelsCount, int truckWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.weight = truckWeight;
    }
}
