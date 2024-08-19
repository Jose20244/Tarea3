import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public T find(int id) {
        // Implementa la búsqueda por ID
        // Retorna null si no se encuentra
        // (Manejo de excepción en el siguiente paso)
        return null;
    }

    public int getSize() {
        return items.size();
    }
}
