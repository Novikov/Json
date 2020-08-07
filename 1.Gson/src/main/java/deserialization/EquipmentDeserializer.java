package deserialization;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import data.Equipment;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class EquipmentDeserializer implements JsonDeserializer {

    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Equipment equipment = new Equipment("","");
        String data = json.getAsString();
        List<String> parts = Arrays.asList(data.split(" "));

        equipment.setColor(parts.get(0));
        equipment.setName(parts.get(6)+" "+parts.get(7));

        return equipment;
    }
}
