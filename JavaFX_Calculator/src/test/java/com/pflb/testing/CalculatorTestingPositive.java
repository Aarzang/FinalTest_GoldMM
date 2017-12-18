package com.pflb.testing;

import org.junit.*;
import com.pflb.helpers.worker.MathDealer;

//Набор положительных тестов.
public class CalculatorTestingPositive {

    //Проверка деления ноля на иные числа.
    @Test
    public void positiveZeroDivided() {

        Assert.assertEquals(0.0, MathDealer.checkNumbers("0", "-10").doubleValue(), 0.0000000000000001);
    }

    //Деление целых положительных чисел.
    @Test
    public void positiveIntegersDivided() {

        Assert.assertEquals(0.5, MathDealer.checkNumbers("3", "6").doubleValue(), 0.0000000000000001);
    }

    //Деление дробных чисел с целым результатом.
    @Test
    public void positiveIntegerResult() {

        Assert.assertEquals(3.0, MathDealer.checkNumbers("3.3", "1.1").doubleValue(), 0.0000000000000001);
    }

    //Деление с отрицательным результатом.
    @Test
    public void positiveMinusResult() {

        Assert.assertEquals(-1.0, MathDealer.checkNumbers("99", "-99").doubleValue(), 0.0000000000000001);
    }

    //Деление с дробным длинным результатом.
    @Test
    public void positiveDoubleResult() {

        Assert.assertEquals(0.3333333333333333, MathDealer.checkNumbers("1", "3").doubleValue(), 0.0000000000000001);
    }

}
