package com.pflb.testing;

import org.junit.*;
import com.pflb.helpers.worker.MathDealer;

public class CalculatorTesting {

    private MathDealer checker = new MathDealer();

    @Test
    public void successMathTest() {

        Assert.assertEquals("Wrong result",0, checker.checkNumbers("-9.6", "3.2"));
    }

    @Test
    public void negativeMathTestBlankFields() {

        Assert.assertEquals("Wrong result",1, checker.checkNumbers("", ""));
    }

    @Test
    public void negativeMathTestDividingByZero() {

        Assert.assertEquals("Wrong result",2, checker.checkNumbers("-6", "0"));
    }

    @Test
    public void negativeMathTestLotsOfMinuses() {

        Assert.assertEquals("Wrong result",1, checker.checkNumbers("------6", "8"));
    }

    @Test
    public void negativeMathTestLotsOfDots() {

        Assert.assertEquals("Wrong result",01, checker.checkNumbers("0...6", ">71."));
    }

    @Test
    public void negativeMathTestLotsOfLetters() {

        Assert.assertEquals("Wrong result",1, checker.checkNumbers("ukygkyu76t876tg", "!$@!@#$"));
    }

    @Test
    public void negativeMathTestLotsOfSpases() {

        Assert.assertEquals("Wrong result",1, checker.checkNumbers("666 6 66", "    8"));
    }

}
