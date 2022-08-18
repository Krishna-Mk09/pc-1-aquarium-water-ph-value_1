package com.jap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PhLevelAnalyserTest {
    PhLevelAnalyser input;

    @Before
    public void setUp() {
        input = new PhLevelAnalyser();
    }

    @After
    public void tearDown() {
    }

    @Test
    // This is a test case for the PhLevelAnalyser class.
    public void getPhValueWater() {
        int phValue = 8;
        String expectedResult = "pH value is fine";
        //act
        String actualresult = input.getPhValueOfWater(phValue);
        //assertion
        Assert.assertEquals(expectedResult, actualresult);
    }

    @Test
    // This is a test case for the PhLevelAnalyser class.
    public void phvalueforgreatertNum() {
        int phValue = 10;
        String expectedOutput = "pH value is high, partial water change required";
        //act
        String actualOutput = input.getPhValueOfWater(phValue);
        //assertion
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    // This is a test case for the PhLevelAnalyser class.
    public void ph() { //arrange
        int PhValue = 7;
        String expectedOutput = "pH value is fine";
        //act
        String actualOutput = input.getPhValueOfWater(PhValue);
        //ASSERTION
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}