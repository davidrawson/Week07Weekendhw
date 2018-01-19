import java.util.ArrayList;

public class Shop<T> {
    ArrayList<T> items;

    public Shop() {
        this.items = new ArrayList<T>();
    }

    public void addItem(T item){
        this.items.add(item);
    }

    public int itemCount(){
        return this.items.size();
    }

    public T removeItem(){
        return this.items.remove(0);
    }
}
