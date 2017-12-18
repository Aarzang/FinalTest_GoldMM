package com.pflb.testing;

import org.junit.*;
import com.pflb.helpers.worker.MathDealer;

//Набор негативных тестов.
public class CalculatorTestingNegative {

    //Тест полей без ввода.
    @Test
    public void negativeMathTestBlankFields() {

        Assert.assertEquals(0.0000000000000001, MathDealer.checkNumbers("", "").doubleValue(), 0.00000000000000001);
    }

    //Тест деления на ноль.
    @Test
    public void negativeMathTestDividingByZero() {

        Assert.assertEquals(0.0000000000000002, MathDealer.checkNumbers("-6", "0").doubleValue(), 0.00000000000000001);
    }

    //Тест лишних знаков.
    @Test
    public void negativeMathTestLotsOfMinuses() {

        Assert.assertEquals(0.0000000000000001, MathDealer.checkNumbers("------6", "8").doubleValue(), 0.00000000000000001);
    }

    //Тест лишних точек.
    @Test
    public void negativeMathTestLotsOfDots() {

        Assert.assertEquals(0.0000000000000001, MathDealer.checkNumbers("0...6", ">71.").doubleValue(), 0.00000000000000001);
    }

    //Тест ввода различных символов.
    @Test
    public void negativeMathTestLotsOfLetters() {

        Assert.assertEquals(0.0000000000000001, MathDealer.checkNumbers("ukygkyu76t876tg", "!$@!@#$").doubleValue(), 0.00000000000000001);
    }

    //Тест лишних пробелов.
    @Test
    public void negativeMathTestLotsOfSpases() {

        Assert.assertEquals(0.0000000000000001, MathDealer.checkNumbers("666 6 66", "    8").doubleValue(), 0.00000000000000001);
    }

}
