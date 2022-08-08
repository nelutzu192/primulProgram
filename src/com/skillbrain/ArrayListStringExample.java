package com.skillbrain;

import java.util.ArrayList;

public class ArrayListStringExample {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //cum luam o valoare cars
        String masina = cars.get(1);
        System.out.println(masina);

        //adaugam o valoare la final
        cars.add("Dacia");
        System.out.println(cars);

        //eliminam o valoare
        cars.remove(0);
        System.out.println(cars);

        //inlocuim o valoare
        cars.set(3, "Renault");


    }
}
