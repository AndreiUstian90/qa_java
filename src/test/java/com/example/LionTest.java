package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    Feline feline = new Feline();

    private final String checkedSex;
    private final boolean expectedResult;
    private Lion lion;

    @Before
    public void initialize() throws Exception {
        lion = new Lion(checkedSex);
    }

    public LionTest(String checkedSex, boolean expectedResult) {
        this.checkedSex = checkedSex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection sex() {
        return Arrays.asList(new Object[][] {
                {"Самец", true},
                {"Самка", false},
        });
    }

    @Test
    public void checkLionDoesHaveMane() {
        System.out.println("Parameterized Sex is: " + checkedSex);
        assertEquals(expectedResult, lion.doesHaveMane());
    }

    @Test
    public void checkLionGetFood() throws Exception {
        Lion lion = new Lion(checkedSex);
        List<String> expected = lion.getFood();
        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkLionGetKittens() throws Exception {
        Lion lion = new Lion(checkedSex);
        int expected = lion.getKittens();
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
