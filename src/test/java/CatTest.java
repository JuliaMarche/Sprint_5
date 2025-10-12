package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;



@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getCatSoundIsCorrect(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound(), "Метод должен возвращать 'Мяу'");
    }

}
