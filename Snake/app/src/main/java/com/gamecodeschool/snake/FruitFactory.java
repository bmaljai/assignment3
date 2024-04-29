package com.gamecodeschool.snakegame;

public interface FruitFactory {
    Fruit createFruit();
}

// How to use:
// FruitFactory fruitFactory = new BasicFruitFactory(context, new Point(NUM_BLOCKS_WIDE, mNumBlocksHigh), blockSize);
// mFruit = fruitFactory.createFruit(); // Use factory to create the initial fruit