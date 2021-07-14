package io.muic.ooc.fab;

import static io.muic.ooc.fab.AnimalType.FOX;
import static io.muic.ooc.fab.AnimalType.RABBIT;

public class AnimalFactory {
    public static Animal createAnimal(AnimalType animalType, Field field, Location location) {
        switch (animalType) {
            case RABBIT:
                return new Rabbit(true, field, location);
            case FOX:
                return new Fox(true, field, location);
            default:
                throw new IllegalArgumentException("Unknown animalType");
        }
    }
}
