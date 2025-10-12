package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void maleHasManeTest () throws Exception{
        Lion lion = new Lion(feline, "Самец");
        assertTrue(lion.doesHaveMane(),"Должен возвращаться true");
    }

    @Test
    public void femaleHasNotManeTest () throws Exception{
        Lion lion = new Lion(feline, "Самка");
        assertFalse(lion.doesHaveMane(), "Должен возвращаться false");
    }

    @Test
    public void invalidSexTest (){
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Другое"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void getKittensIsCorect() throws Exception{
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens(),"Некорректное число котят");
    }

    @Test
    public void getFoodIsCorrect() throws Exception {
        Lion lion = new Lion (feline, "Самец");
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood ,lion.getFood());
    }

}
