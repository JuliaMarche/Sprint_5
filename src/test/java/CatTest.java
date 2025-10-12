package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getCatSoundIsCorrect(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound(),"Должен возвращаться аргумент 'Мяу'");
    }

    @Test
    public void getFoodReturnsFoodList() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood,cat.getFood(),"Должен возвращаться список: 'Животные', 'Птицы', 'Рыба'");
    }

}
