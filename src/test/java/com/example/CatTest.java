package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void checkCatGetSound() {
        Cat cat = new Cat(feline);
        String expected = cat.getSound();
        String actual = "Мяу";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  checkCatGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = cat.getFood();
        List<String> actual = Arrays.asList();
        Assert.assertEquals(expected, actual);
    }
}
