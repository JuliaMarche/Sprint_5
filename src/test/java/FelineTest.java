package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FelineTest {

    @Test
    public void eatMeatIsCorrect() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat(), "Должен возвращаться список: 'Животные', 'Птыцы', 'Рыба'");
    }

    @Test
    public void getFamilyIsCorrect (){
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily(),"Некорректное название семейства");
    }

    @Test
    public void getKittensDefaultIsCorrect(){
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(),"Некорректное число котят");
    }

    @Test
    public void getKittensWithArgumentsIsCorrect(){
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5),"Некорректное число котят");
    }

}
