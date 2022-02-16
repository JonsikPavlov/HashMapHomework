package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToyShop {
    /* Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
     * Перебрать и распечатать пары значений - entrySet().
     * Перебрать и распечатать набор из имен продуктов  - keySet().
     * Перебрать и распечатать значения продуктов - values().
     * Для каждого перебора создать свой метод.*/
    private static Map<String, Product> map = new HashMap<>();
    public static void main(String[] args) {
        Product toy0 = new Product("Transformer", 12, 30.50, true, 2023);
        Product toy1 = new Product("Electric BMW", 7, 430.99, true, 2025);
        Product toy2 = new Product("Gerber mash", 1, 7.50, true, 2021);
        Product toy3 = new Product("PS4", 10, 500, false, 2030);
        Product toy4 = new Product("Table football", 12, 499.99, true, 2029);
        map.put(toy0.getToyName(), toy0);
        map.put(toy1.getToyName(), toy1);
        map.put(toy2.getToyName(), toy2);
        map.put(toy3.getToyName(), toy3);
        map.put(toy4.getToyName(), toy4);
        pairsOfKeyValues();
        System.out.println("Client is trying to by Transformer :");
        tellerMachine(toy0, 2023);
        System.out.println("Client is trying to by Gerber mash :");
        tellerMachine(toy2, 2021);
        System.out.println("Client is trying to by PS4 :");
        tellerMachine(toy3, 2030);
        System.out.println("\nThe keys are next:");
        System.out.println(keySetting());
        System.out.println("\nTHe values are next:");
        System.out.println(values());
        }

    public static Map<String,Product> pairsOfKeyValues(){
        for (Map.Entry<String, Product> entry: map.entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
            Product value = entry.getValue();
            System.out.println(value);
        }
        return map;
    }

    public static List<String> keySetting(){
        List<String> keyList = new ArrayList<>(map.keySet());
        return keyList;
    }

    public static List<Product> values(){
        List<Product> valuesList = new ArrayList<>(map.values());
        return valuesList;
    }



    public static void tellerMachine(Product items, int validUntilYear) {
        if (validUntilYear >= 2022) {
            items.toyWarranty();
        } else {
            Product.utilProduct(validUntilYear);
        }
    }
}
