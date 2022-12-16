package transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        if (capacity == null) {
            capacity = Capacity.MEDIUM;
        }
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Автобус " + getBrand() + " заполнен топливом");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("У транспортного средства " + getBrand() +
                    ", Вместимость " + capacity.getFrom() + "-" +
                    capacity.getBefore() + " мест");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 100);
    }

    @Override
    public String toString() {
        return super.toString() + (capacity != null ? ", Вместимость " + capacity.getFrom() + "-" +
                capacity.getBefore() + " мест" : " Нет данных");
    }
}
