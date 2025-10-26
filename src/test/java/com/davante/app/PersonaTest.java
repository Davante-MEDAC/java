package com.davante.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersonaTest {

    @Test
    public void shouldPrintNameAndAge() {
        Persona persona = new Persona("John", 30);
        String expected = "Persona{name='John', age=30}";
        assertTrue(persona.toString().equals(expected));
    }
}
