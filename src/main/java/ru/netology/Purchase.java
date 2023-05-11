package ru.netology;

import java.util.HashMap;
//действия над покупками

public class Purchase {
    protected HashMap<String, Integer> price;
    //магические числа - new Purchase[4]
    //теперь product передается в параметрах конструктора и размер прайса может быть любой
    protected Basket basket;

    public Purchase(HashMap<String, Integer> price) {
        this.price = price;
        basket = new Basket(price);
    }

    public void addPurchase(String title, int count) {
        basket.addPurchaseInBasket(title, count);
    }

    //действия над корзиной - принцип единственной ответственности, sum() вынести в отдельный класс
    //создан отдельный класс Basket, где все действия проводятся над корзиной, а не над покупками
}
