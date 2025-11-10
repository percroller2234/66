import java.util.LinkedList;

public class Cache<T> {
    private LinkedList<T> items;
    private int maxSize;

    public Cache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Размер кэша должен быть больше 0");
        }
        this.maxSize = maxSize;
        this.items = new LinkedList<>();
    }

    public void add(T item) {
        if (items.size() >= maxSize) {
            items.removeFirst();
        }
        items.addLast(item);
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public boolean exists(T item) {
        return items.contains(item);
    }

    public T getFirst() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getFirst();
    }

    public T getLast() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getLast();
    }

    public T getItemByIndex(int i) {
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    public void display() {
        System.out.println("Содержимое кэша: " + items);
    }

    // Дополнительные полезные методы
    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
