package ru.netology;

import java.util.HashMap;
import java.util.Map;

//действия над корзиной
public class Basket {
    protected Map<String, Integer> price;
    protected HashMap<String, Integer> basket;

    public Basket(Map<String, Integer> price) {
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
