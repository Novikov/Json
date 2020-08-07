package serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import data.Car;

import java.lang.reflect.Type;

//Самый легкий способ, если мы хотим исключить какие то поля из результирующего Json
public class CarSerializer implements JsonSerializer<Car> {


    @Override
    public JsonElement serialize(Car src, Type typeOfSrc, JsonSerializationContext context) {
        return null;
    }
}
