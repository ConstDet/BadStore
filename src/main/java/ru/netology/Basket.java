package ru.netology;

import java.util.HashMap;
import java.util.Map;

//действия над корзиной
public class Basket {
    protected String title;
    protected int count;
    protected HashMap<String, Integer> price;
    HashMap<String, Integer> basket;
    public Basket(String title, int count, HashMap<String, Integer> price) {
        this.title = title;
        this.count = count;
        this.price = price;
    }

    public Basket(HashMap<String, Integer> price) {
        this.price = price;
    }

    public void addPurchaseInBasket(String title, int count) {
        if (basket == null) {
            basket = new HashMap<>();
            basket.put(title, count);
        } else if (basket.containsKey(title)){
            basket.put(title, basket.get(title) + count);
        } else {
            basket.put(title, count);
        }
    }

    public long sum() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for(Map.Entry<String, Integer> entry : basket.entrySet()) {
            sum += (long) price.get(entry.getKey()) * entry.getValue();
        }
        return sum;
    }
}
