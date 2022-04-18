package calculator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static double DELTA=1e-15;
    Calculator calculator=new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial for true positive",120,calculator.factorial(5).doubleValue(),DELTA);
        assertEquals("Factorial for true positive",24,calculator.factorial(4).doubleValue(),DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial for false positive",1,calculator.factorial(3).doubleValue(),DELTA);
        assertNotEquals("Factorial for false positive",100,calculator.factorial(6).doubleValue(),DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root for true positive",8,calculator.squareRoot(64),DELTA);
        assertEquals("Square Root for true positive",10,calculator.squareRoot(100),DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root for false positive",5,calculator.squareRoot(625),DELTA);
        assertNotEquals("Square Root for false positive",4,calculator.squareRoot(256),DELTA);
    }

    @Test
    public void naturalLogarithmTruePositive(){
        assertEquals("Natural Logarithm for true positive",1.6094379124341003,calculator.naturalLogarithm(5),DELTA);
        assertEquals("Natural Logarithm for true positive",0,calculator.naturalLogarithm(1),DELTA);
    }

    @Test
    public void naturalLogarithmFalsePositive(){
        assertNotEquals("Natural Logarithm for false positive",50,calculator.naturalLogarithm(6),DELTA);
        assertNotEquals("Natural Logarithm for false positive",10,calculator.naturalLogarithm(100),DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power for true positive",1024,calculator.power(2,10),DELTA);
        assertEquals("Power for true positive",81,calculator.power(3,4),DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power for false positive",20,calculator.power(2,10),DELTA);
        assertNotEquals("Power for false positive",10,calculator.power(5,4),DELTA);
    }
}
