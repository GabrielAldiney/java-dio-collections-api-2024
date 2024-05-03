
import list.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        Item item = new Item(name, price, quantity);
        this.itemList.add(Item);
    }

    public static void main(String[] args) {
        addItem("name", 20.00, 2);
    }

}