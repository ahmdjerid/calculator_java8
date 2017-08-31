package com.olbati.kata;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void return_zero_empty_string() {
        //when
        int result = Calculator.calculate("");
        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void return_same_input_number() {
        //given

        //when
        int result = Calculator.calculate("1");

        //then
        Assert.assertEquals(1, result);

    }

    @Test
    public void return_sum_of_tow_number() {
        //given

        //when
        int result = Calculator.calculate("1,2");
        //then
        Assert.assertEquals(3, result);

    }


    @Test
    public void return_sum_with_other_delimiter() {
        //given

        //when
        int result = Calculator.calculate("1\n2");
        //then
        Assert.assertEquals(3, result);


    }

    @Test
    public void sum_with_fixed_delimiter() {
        //given

        //when
        int result = Calculator.calculate("//;\n1;2;4");
        //then
        Assert.assertEquals(7, result);

    }



}
