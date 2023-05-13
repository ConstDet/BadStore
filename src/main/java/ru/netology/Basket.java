package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//действия над корзиной
public class Basket {
    protected Map<String, Integer> price;
    protected List<Purchase> purchases;

    public Basket(Map<String, Integer> price) {
        this.price = price;
        purchases = new ArrayList<>();
    }

    public void addPurchaseInBasket(String title, int count) {
        purchases.add(new Purchase(title, count));
    }

    public long sum() {
        long sum = 0;
        for (Purchase p : purchases) {
            sum += (long) price.get(p.title) * p.count;
        }
        return sum;
    }
}
