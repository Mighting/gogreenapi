package DB;

import java.util.ArrayList;

public interface StandardDAO<T> {
    T getFromID(int id);
    ArrayList<T> getAll();
    int insert(T item);
    T add(T item);
    T update(T item);
    T disable(T item);
}
