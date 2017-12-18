package com.pflb.helpers.worker;

import java.math.MathContext;
import java.math.BigDecimal;
import java.lang.NumberFormatException;

public class MathDealer {

    private MathDealer(){};

    public static BigDecimal checkNumbers(String dividend, String divider){
        BigDecimal numbersResult;

        double dividendDouble;
        double dividerDouble;

        try{
            dividendDouble = Double.parseDouble(dividend);
            dividerDouble = Double.parseDouble(divider);
        }catch(NumberFormatException Ex){
            numbersResult = new BigDecimal(0.0000000000000001);
            return numbersResult;
        }

        if(Math.abs(dividendDouble) == Double.POSITIVE_INFINITY || Math.abs(dividerDouble) == Double.POSITIVE_INFINITY || Double.compare(dividendDouble, Double.NaN) == 0 || Double.compare(dividerDouble, Double.NaN) == 0) {
            numbersResult = new BigDecimal(0.0000000000000001);
            return numbersResult;
        }
        else
            if(dividerDouble == 0D){
                numbersResult = new BigDecimal(0.0000000000000002);
                return numbersResult;
            }
            else
                if(dividerDouble < 0D && dividendDouble == 0D) {
                    numbersResult = new BigDecimal(0.0);
                    return numbersResult;
                }

        numbersResult = new BigDecimal(dividendDouble/dividerDouble, MathContext.DECIMAL64);

        return numbersResult;
    }
}
