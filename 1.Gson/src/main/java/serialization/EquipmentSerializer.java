package serialization;

import com.google.gson.*;
import data.Equipment;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EquipmentSerializer implements JsonSerializer<Equipment> {

    @Override
    public JsonElement serialize(Equipment src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray jsonArray = new JsonArray();

        if(src.getColor().equals("")&&src.getName().equals("")){
            return new JsonPrimitive("is it really a car?");
        }

        List<String> list = new LinkedList<String>();

        if (!src.getColor().equals(""))
        {
            list.add("color");
        }

        if (!src.getName().equals(""))
        {
            list.add("equipment name");
        }

        return new JsonPrimitive(
                new StringBuilder(src.getColor())
                        .append(" ")
                        .append(list.get(0))
                        .append(" ")
                        .append("and")
                        .append(" ")
                        .append(list.get(1) + " - ")
                        .append(src.getName())
                        .toString()
        );
    }

}
