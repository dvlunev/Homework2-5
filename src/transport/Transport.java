package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (StringUtils.isNullOrEmptyOrBlank(brand)) {
            brand = "default";
        }
        this.brand = brand;
        if (StringUtils.isNullOrEmptyOrBlank(model)) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 2.0;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();

    public abstract void printType();

    @Override
    public String toString() {
        return "Транспорт: Марка " + brand +
                ", Модель " + model +
                ", Обьем двигателя " + engineVolume;
    }
}
