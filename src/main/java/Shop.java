import behaviours.ISellable;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addStockItem(ISellable item){
        this.stock.add(item);
    }

    public int itemCount(){
        return this.stock.size();
    }

    public void removeItem(ISellable item){
        for (int i=0; i<stock.size(); i++){
            if (stock.get(i) == item){
                stock.remove(i);
            }
        }
    }

    public double totalPotentialProfit(){
        double totalPotentialProfit = 0.0;
        for (int i=0; i<stock.size(); i++){
            totalPotentialProfit += stock.get(i).calculateMarkup();
        }
        return totalPotentialProfit;
    }
}
