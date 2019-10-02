package Manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverter implements Converter {


    @Override
    public Object StringToObject(String string, Class objectClass) {
        //Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Gson gson = new Gson();
        return gson.fromJson(string, objectClass);
    }

    @Override
    public String ObjectToString(Object object) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.toJson(object);
    }
}