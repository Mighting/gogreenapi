package Manager;

public interface Convertable<T> {

    public T StringToObject(String string, Class object);
    public String ObjectToString(T object);


}
