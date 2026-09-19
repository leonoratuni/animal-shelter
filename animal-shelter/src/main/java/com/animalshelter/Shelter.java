package com.animalshelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> animals;

    public Shelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public int getAnimalCount() {
        return animals.size();
    }
    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    public List<Animal> getAllAnimals() {
        return animals;
    }
}