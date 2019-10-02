package Manager;

public interface Converter<T> {

    public T StringToObject(String string, Class object);
    public String ObjectToString(T object);


}
