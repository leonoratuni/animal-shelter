package com.animalshelter;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class ShelterTest1 {

    @Test
    public void testAddAnimal() {
        Shelter shelter = new Shelter();
        Animal animal = new Animal("Maksi", "Dog", 3);
        shelter.addAnimal(animal);
        assertEquals(1, shelter.getAnimalCount());
    }
@Test
public void testFindAnimalByName() {
    Shelter shelter = new Shelter();
    Animal animal = new Animal("Maksi", "Dog", 3);
    shelter.addAnimal(animal);
    
    Animal found = shelter.findAnimalByName("Maksi");
    assertNotNull(found);
    assertEquals("Maksi", found.getName());
}
@Test
public void testRemoveAnimal() {
    Shelter shelter = new Shelter();
    Animal animal = new Animal("Maksi", "Dog", 3);
    shelter.addAnimal(animal);
    
    shelter.removeAnimal(animal);
    assertEquals(0, shelter.getAnimalCount());
}
@Test
public void testGetAllAnimals() {
    Shelter shelter = new Shelter();
    Animal animal1 = new Animal("Maksi", "Dog", 3);
    Animal animal2 = new Animal("Bobi", "Dog",  2);
    
    shelter.addAnimal(animal1);
    shelter.addAnimal(animal2);
    
    List<Animal> allAnimals = shelter.getAllAnimals();
    assertEquals(2, allAnimals.size());
    assertTrue(allAnimals.contains(animal1));
    assertTrue(allAnimals.contains(animal2));
}
@Test
public void testFindAnimalsByType() {
    Shelter shelter = new Shelter();
    Animal dog1 = new Animal("Rex", "Dog", 3);
    Animal dog2 = new Animal("Max", "Dog", 5);
    Animal cat1 = new Animal("Mimi", "Cat", 2);
    
    shelter.addAnimal(dog1);
    shelter.addAnimal(dog2);
    shelter.addAnimal(cat1);
    
    List<Animal> dogs = shelter.findAnimalsByType("Dog");
    assertEquals(2, dogs.size());
    assertTrue(dogs.contains(dog1));
    assertTrue(dogs.contains(dog2));
}

@Test
public void testFindAnimalsByAge() {
    Shelter shelter = new Shelter();
    Animal a1 = new Animal("Rex", "Dog", 3);
    Animal a2 = new Animal("Max", "Dog", 5);
    Animal a3 = new Animal("Mimi", "Cat", 3);
    
    shelter.addAnimal(a1);
    shelter.addAnimal(a2);
    shelter.addAnimal(a3);
    
    List<Animal> ageThreeAnimals = shelter.findAnimalsByAge(3);
    assertEquals(2, ageThreeAnimals.size());
    assertTrue(ageThreeAnimals.contains(a1));
    assertTrue(ageThreeAnimals.contains(a3));
}
}