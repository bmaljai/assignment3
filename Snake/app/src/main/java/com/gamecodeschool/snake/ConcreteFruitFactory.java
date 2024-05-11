package com.gamecodeschool.snake;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ConcreteFruitFactory implements FruitFactory {
    private final List<Fruit> fruits;
    private int currentIndex = 0;

    public ConcreteFruitFactory(Context context, Point spawnRange, int size){
        // Initialize and add fruit types to the list
        fruits = new ArrayList<>();
        fruits.add((Fruit) new Apple(context, spawnRange, size));
        fruits.add(new Banana(context, spawnRange, size));

        Log.d("FruitFactory", "Fruit Factory Initialized: " + fruits.size() + " fruits available.");

    }

    @Override
    public Fruit createFruit(){
        // Get the current fruit from the list
        Fruit fruit = fruits.get(currentIndex);

        Log.d("FruitFactory", "Current Index: " + currentIndex + ", Fruit: " + fruit.getClass().getSimpleName());


        // Update the index to the next fruit, wrapping around if necessary
        currentIndex = (currentIndex + 1) % fruits.size();

        // Since fruits like Apple and Banana may need to be reinitialized or reset, we do that here
        fruit.spawn();

        return fruit;
    }
}


