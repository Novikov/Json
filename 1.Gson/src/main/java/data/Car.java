package data;

import java.util.Date;

public class Car {
    private String brand;
    private String model;
    private Date year;
    private Engine engine;
    private Equipment equipment;
    private Tuning tuning;

    public Car(String brand, String model, Date year, Engine engine, Equipment equipment) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.equipment = equipment;
    }

    {
        tuning = null;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Date getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Tuning getTuning() {
        return tuning;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setTuning(Tuning tuning) {
        this.tuning = tuning;
    }
}
