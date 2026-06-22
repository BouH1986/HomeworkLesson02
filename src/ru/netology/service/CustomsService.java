package ru.netology.service;

public class CustomsService    {

     public static final int FEE_ON_WEIGHT = 100;

     public static int calculateCustoms(int price, int weight) {
        int a = price / 100;
        int b = weight * FEE_ON_WEIGHT;
        return a + b;
    }

}
