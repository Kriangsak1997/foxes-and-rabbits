package io.muic.ooc.fab;

import java.awt.*;
import java.util.Collections;

public enum AnimalType {
    RABBIT(0.08, Rabbit.class, Color.ORANGE),
    FOX(0.02, Fox.class, Color.BLUE),
    TIGER(0.04, Tiger.class, Color.RED);

    private double breedingProbability;
    private Color color;



    private Class animalClass;
    public Class getAnimalClass() {
        return animalClass;
    }


    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Color getColor() {
        return color;
    }

    AnimalType(double breedingProbability, Class animalClass, Color color) {
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
        this.color = color;
    }
}
