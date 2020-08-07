package data;

import java.util.Date;

public class CarUtil {
    public static AutoPark createAutoPark(){
        AutoPark autoPark = new AutoPark();

        Transmission autoTransmission = new Transmission("model S","auto transmission");
        Transmission mechanicTransmission = new Transmission("model S","mechanic transmission");

        Engine oneJZ = new Engine("Gas","276 hp","back",mechanicTransmission);
        Engine twoJZ = new Engine("Gas","276 hp","back",autoTransmission);

        Equipment blackTourerS = new Equipment("Tourer S","Black");
        Equipment redTourerS = new Equipment("Tourer S","Red");
        Equipment whiteTourerV = new Equipment("Tourer V","White");

        Tuning customWheels = new Tuning("Custom wheels");
        Tuning customHood = new Tuning("Custom hood");
        Tuning customBumpers = new Tuning("Custom bumpers");
        Tuning absent = new Tuning("No tuning");

        Car chaser = new Car("Toyota","Chaser",new Date(1999),oneJZ,blackTourerS);
        chaser.setTuning(customWheels);
        chaser.setTuning(customHood);
        chaser.setTuning(customBumpers);
        Car mark2 = new Car("Toyota", "Mark 2", new Date(1997),oneJZ,redTourerS);
        mark2.setTuning(absent);
        Car cresta = new Car("Toyota", "Cresta", new Date(1998),oneJZ,whiteTourerV);
        cresta.setTuning(customBumpers);

        autoPark.addCar(chaser);
        autoPark.addCar(mark2);
        autoPark.addCar(cresta);

        return autoPark;
    }
}
