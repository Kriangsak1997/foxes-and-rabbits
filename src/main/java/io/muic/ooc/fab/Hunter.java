package io.muic.ooc.fab;

import java.util.Iterator;
import java.util.List;

public class Hunter extends Predator {

    @Override
    protected double getBreedingProbability() {
        return AnimalType.HUNTER.getBreedingProbability();
    }

    @Override
    protected int getMaxLitterSize() {
        return 2;
    }

    @Override
    protected int getBreedingAge() {
        return 35;
    }

    @Override
    protected int getFoodValue(Animal animal) {
        return AnimalType.HUNTER.getFoodValue();
    }

    @Override
    protected int getMaxAge() {
        return 6000;
    }

    @Override
    protected void setDead() {
        //do nothing here cuz it cant be preyed upon
    }

    @Override
    protected boolean isFood(Animal animal) {
        //Fox can only prey on everything out there
        return animal instanceof Tiger || animal instanceof Fox || animal instanceof Rabbit;
    }
}
