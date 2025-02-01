package com.example.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testHasOldDog() {
        Dog oldDog = new Dog("Max", 12);
        Person personWithOldDog = new Person("Alice", 30, oldDog);
        assertTrue(personWithOldDog.hasOldDog());
    }

    @Test
    void testHasOldDog_NoDog() {
        Person personWithoutDog = new Person("Bob", 40);
        assertFalse(personWithoutDog.hasOldDog());
    }

    @Test
    void testChangeDogsName() {
        Dog dog = new Dog("Charlie", 5);
        Person personWithDog = new Person("David", 28, dog);
        personWithDog.changeDogsName("Rocky");
        assertEquals("Rocky", dog.getName());
    }

    @Test
    void testChangeDogsName_NoDog() {
        Person personWithoutDog = new Person("Eve", 35);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            personWithoutDog.changeDogsName("Bella");
        });
        assertEquals("Eve does not own a dog!", exception.getMessage());
    }
}
