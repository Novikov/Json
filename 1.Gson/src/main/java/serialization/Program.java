package serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.AutoPark;
import data.Car;
import data.CarUtil;
import data.Equipment;

public class Program {
    public static void main(String[] args) {
        AutoPark autoPark = CarUtil.createAutoPark();
        Gson gson = new GsonBuilder().
//                registerTypeAdapter(Car.class, new CarSerializer()).
                registerTypeAdapter(Equipment.class,new EquipmentSerializer()).
                setPrettyPrinting().
                create();
        String jsonString = gson.toJson(autoPark);
        System.out.println(jsonString);
    }
}


//setPrettyPrinting - добавляет отступы в Json строку
//Сериализаторы пишутся только для тех классов, которые мы хотим сериализовать особенным образом. Их нужно инициализировать в
//GsonBuilder. Все остальные классы будут сериализоваться обычным образом, как решит Gson.
