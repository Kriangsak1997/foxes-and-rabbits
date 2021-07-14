package io.muic.ooc.fab;

import java.util.Iterator;
import java.util.List;

public class Tiger extends Predator {

    @Override
    public int getMaxAge() {
        return 200;
    }

    @Override
    protected double getBreedingProbability() {
        return AnimalType.TIGER.getBreedingProbability();
    }

    @Override
    protected int getMaxLitterSize() {
        return 2;
    }

    @Override
    protected int getBreedingAge() {
        return 30;
    }

    @Override
    protected boolean isFood(Animal animal) {
        //Fox can  prey on Rabbit and Fox
        return animal instanceof Rabbit || animal instanceof Fox;
    }
    @Override
    protected int getFoodValue(Animal animal) {
        return AnimalType.TIGER.getFoodValue();
    }
}
