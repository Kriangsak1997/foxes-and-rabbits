package io.muic.ooc.fab;

public enum AnimalType {
    RABBIT(0.08, Rabbit.class),
    FOX(0.02, Fox.class);

    private double breedingProbability;


    private Class animalClass;
    public Class getAnimalClass() {
        return animalClass;
    }


    public double getBreedingProbability() {
        return breedingProbability;
    }

    AnimalType(double breedingProbability, Class animalClass) {
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
    }
}
