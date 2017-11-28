package com.pflb.helpers.worker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathDealer {

    private static final String regExp = "[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*";
    private static final Pattern pattern = Pattern.compile(regExp);

    public int checkNumbers(String dividend, String divider){
        int numbersOk = 0;
        Matcher first = pattern.matcher(dividend);
        Matcher second = pattern.matcher(divider);
        if(first.matches()&&second.matches()){
            if(Double.parseDouble(divider)==0) numbersOk = 2;
        }else numbersOk = 1;
        return numbersOk;
    }
}
