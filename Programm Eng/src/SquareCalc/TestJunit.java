package SquareCalc;

import org.junit.Test;

import static SquareCalc.Main.*;
import static org.junit.Assert.*;

public class TestJunit {
    @Test
    public void testCalculateLegthsOfSides() {
        double[] testData = {1, 0, 0, 1, 0, 0};
        double[] answer = {1.414, 1, 1};
        assertArrayEquals(answer, calculateLengthsOfSides(testData));
    }
    @Test
    public void testIsCorrect(){
        assertTrue(isCorrect(2,3,4));
        assertFalse(isCorrect(1,2,3));
    }
    @Test
    public void testCalculateSquare(){
        double[] testValues1={1,1.414,1};
        double[] testValues2={0,1.414,1};

        assertEquals("0,500",calculateSquare(testValues1) );
        assertEquals("Такого треугольника не существует", calculateSquare(testValues2));
    }

    private void assertArrayEquals(double[] answer, double[] calculateLengthsOfSides) {
        if( answer.length == calculateLengthsOfSides.length){
            for (int i = 0; i < answer.length ; i++){
                if (Math.abs(answer[i]-calculateLengthsOfSides[i])>0.01)
                    throw new AssertionError();
            }
            return;
        }
    }
}