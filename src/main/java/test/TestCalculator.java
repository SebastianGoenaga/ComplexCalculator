package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.Functions;
import model.Complex;

class TestCalculator {

    @Test
    void testSum() {

        //TestCase
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, -4);

        Complex answer = Functions.CSum(c1, c2);
        Complex answerExpected = new Complex(5, 1);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testRest() {

        //TestCase
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, -4);

        Complex answer = Functions.CRest(c1, c2);
        Complex answerExpected = new Complex(1, 9);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testProduct() {

        //TestCase
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, -4);

        Complex answer = Functions.CProduct(c1, c2);
        Complex answerExpected = new Complex(26, -2);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testDivision() {

        //TestCase
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, -4);

        Complex answer = Functions.CDivision(c1, c2);
        Complex answerExpected = new Complex(-0.6999999999999998, 1.1);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testModulus() {

        //TestCase
        Complex c1 = new Complex(3, 5);

        double c3 = Functions.Modulus(c1);

        assertEquals(5.830951894845301, c3);
    }

    @Test
    void testConjugate() {

        //TestCase
        Complex c1 = new Complex(3, 5);

        Complex answer = Functions.Conjugate(c1);
        Complex answerExpected = new Complex(3, -5);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testPhase() {

        //TestCase
        Complex c1 = new Complex(3, 5);

        double c3 = Functions.Phase(c1);

        assertEquals(59.03624346792648, c3);
    }

    @Test
    void testPolarToCartesian() {

        //TestCase
        Complex c1 = new Complex(5.830951894845301, 59.03624346792648);

        Complex answer = Functions.PolarToCartesian(c1);
        Complex answerExpected = new Complex(3, 5);

        assertEquals(answerExpected, answer);
    }

    @Test
    void testCartesianToPolar() {

        //TestCase
        Complex c1 = new Complex(3, 5);

        Complex answer = Functions.CartesianToPolar(c1);
        Complex answerExpected = new Complex(5.830951894845301, 59.03624346792648);

        assertEquals(answerExpected, answer);
    }


}
