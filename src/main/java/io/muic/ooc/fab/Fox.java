package io.muic.ooc.fab;

import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class Fox extends Predator {

    @Override
    public int getMaxAge() {
        return 150;
    }

    @Override
    protected double getBreedingProbability() {
        return AnimalType.FOX.getBreedingProbability();
    }

    @Override
    protected int getMaxLitterSize() {
        return 2;
    }

    @Override
    protected int getBreedingAge() {
        return 15;
    }

    @Override
    protected boolean isFood(Animal animal) {
        //Fox can only prey on Rabbit
        return animal instanceof Rabbit;
    }

    @Override
    protected int getFoodValue(Animal animal) {
        return AnimalType.FOX.getFoodValue();
    }
}
