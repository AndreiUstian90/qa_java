package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void checkFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = feline.eatMeat();
        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFelineGetFamily() {
        Feline feline = new Feline();
        String expected = feline.getFamily();
        String actual = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFelineGetKittens() {
        Feline feline = new Feline();
        int expected = feline.getKittens();
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFelineGetKittensWithArgument() {
        Feline feline = new Feline();
        int expected = feline.getKittens(1);
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
