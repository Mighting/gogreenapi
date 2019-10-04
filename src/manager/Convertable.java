package manager;

//Simple generic convterter from a string to object and the other way around.
public interface Convertable<T> {

    public T StringToObject(String string, Class object);
    public String ObjectToString(T object);


}
