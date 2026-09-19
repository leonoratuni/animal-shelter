package com.animalshelter;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class ShelterTest {

    @Test
    public void testAddAnimal() {
        Shelter shelter = new Shelter();
        Animal animal = new Animal("Maksi", 3);
        shelter.addAnimal(animal);
        assertEquals(1, shelter.getAnimalCount());
    }
@Test
public void testFindAnimalByName() {
    Shelter shelter = new Shelter();
    Animal animal = new Animal("Maksi", 3);
    shelter.addAnimal(animal);
    
    Animal found = shelter.findAnimalByName("Maksi");
    assertNotNull(found);
    assertEquals("Maksi", found.getName());
}
@Test
public void testRemoveAnimal() {
    Shelter shelter = new Shelter();
    Animal animal = new Animal("Maksi", 3);
    shelter.addAnimal(animal);
    
    shelter.removeAnimal(animal);
    assertEquals(0, shelter.getAnimalCount());
}
@Test
public void testGetAllAnimals() {
    Shelter shelter = new Shelter();
    Animal animal1 = new Animal("Maksi", 3);
    Animal animal2 = new Animal("Bobi", 2);
    
    shelter.addAnimal(animal1);
    shelter.addAnimal(animal2);
    
    List<Animal> allAnimals = shelter.getAllAnimals();
    assertEquals(2, allAnimals.size());
    assertTrue(allAnimals.contains(animal1));
    assertTrue(allAnimals.contains(animal2));
}
}