package com.animalshelter;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnimalTest {

@Test
public void testAnimalCreation() {
Animal animal = new Animal("Maksi", 3);
assertEquals("Maksi", animal.getName());
assertEquals(3, animal.getAge());
}
@Test(expected = IllegalArgumentException.class)
public void testAnimalNegativeAge() {
    new Animal("Bobi", -2);
}
}