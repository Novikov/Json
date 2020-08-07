package common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.AutoPark;
import data.Car;
import data.CarUtil;
import data.Equipment;
import deserialization.EquipmentDeserializer;
import serialization.EquipmentSerializer;

public class Program {
    public static void main(String[] args) {
        AutoPark autoPark = CarUtil.createAutoPark();
        Gson gson = new GsonBuilder().
                registerTypeAdapter(Equipment.class,new EquipmentSerializer()).
                registerTypeAdapter(Equipment.class,new EquipmentDeserializer()).
                setPrettyPrinting().
                create();
        String jsonString = gson.toJson(autoPark);
        System.out.println(jsonString);

        AutoPark deserializedAutoPark = gson.fromJson(jsonString,AutoPark.class);

        System.out.println(deserializedAutoPark.getCars().get(0).getEquipment().getColor());

    }
}


//setPrettyPrinting - добавляет отступы в Json строку
//Сериализаторы пишутся только для тех классов, которые мы хотим сериализовать особенным образом. Их нужно инициализировать в
//GsonBuilder. Все остальные классы будут сериализоваться обычным образом, как решит Gson.
