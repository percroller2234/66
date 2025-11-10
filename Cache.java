import java.util.LinkedList;

public class Cache<T> {
    private LinkedList<T> items;
    private int maxSize;

    public Cache(int maxSize) {
        this.maxSize = maxSize;
        this.items = new LinkedList<>();
    }

    public void add(T item) {
        items.addLast(item);
        if (items.size() > maxSize) {
            items.removeFirst();
        }
    }

    public boolean remote(T item) {
        return items.remove(item);
    }

    public boolean exists(T item) {
        return items.contains(item);
    }

    public T getFirst(){
        if (items.isEmpty()){
            return null;
        }
        return items.getFirst();
    }

    public T getLast(){
        if(items.isEmpty()){
            return null;
        }
        return items.getLast();
    }

    public T getItemByIndex(int i) {
        if (i < 0 || i >=items.size()){
            return null;
        }
        return items.get(i);
    }

    public void display(){
        System.out.println("Cache содержание" + items);
    }

}
