package transport;

public class Car extends Transport implements Competing {

    private String bodyTypeName;

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand,model, engineVolume);
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }

    public void setBodyTypeName(String bodyTypeName) {
        if (bodyTypeName == null) {
            bodyTypeName = "Седан";
        }
        BodyType bodyType = BodyType.findByBodyTypeName(bodyTypeName);
        if (bodyType == null) {
            bodyTypeName = BodyType.valueOf(bodyTypeName).name();
        }
        this.bodyTypeName = bodyTypeName;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    public void refill() {
        System.out.println("Автомобиль " + getBrand() + " заполнен топливом");
    }

    @Override
    public void printType() {
        if (bodyTypeName == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("У транспортного средства " + getBrand() +
                    " тип кузова " + getBodyTypeName());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 7);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 190);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Тип кузова " + (getBodyTypeName() != null ? getBodyTypeName() : "Не указано");
    }
}
