package data;

import com.google.gson.annotations.SerializedName;

public class Engine {
    private String type;
    private String power;
    @SerializedName("drive unit")
    private String driveUnit;
    private Transmission transmission;

    public Engine(String type, String power, String driveUnit, Transmission transmission) {
        this.type = type;
        this.power = power;
        this.driveUnit = driveUnit;
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
