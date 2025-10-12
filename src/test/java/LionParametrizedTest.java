package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionParametrizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец,true",
            "Самка, false"
    })
    public void hasManeTest(String sex, boolean expected) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "123", "Лев", "Lion"})
    public void invalidSexTest(String invalidSex){
    Feline feline = new Feline();
    Exception exception = assertThrows(Exception.class, () -> new Lion(feline, invalidSex));
    assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
