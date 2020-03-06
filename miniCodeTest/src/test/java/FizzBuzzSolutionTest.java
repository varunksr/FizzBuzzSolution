import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzSolutionTest {

    @Test
    public void testHasThreeInNumberSuccess(){
        int number = 31;
        boolean hasThree = FizzBuzzSolution.hasThreeInNumber(number);
        assertTrue(hasThree);
    }

    @Test
    public void testHasThreeInNumberFailure(){
        int number = 11;
        boolean hasThree = FizzBuzzSolution.hasThreeInNumber(number);
        assertFalse(hasThree);
    }

    @Test
    public void testHasFiveInNumberSuccess(){
        int number = 55;
        boolean hasFive = FizzBuzzSolution.hasFiveInNumber(number);
        assertTrue(hasFive);
    }

    @Test
    public void testHasFiveInNumberFailure(){
        int number = 10;
        boolean hasFive = FizzBuzzSolution.hasThreeInNumber(number);
        assertFalse(hasFive);
    }

    @Test
    public void testCheckFizzBuzzDivisibleByThree(){
        int number = 12;
        assertEquals("Fizz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleHasThreeInit(){
        int number = 31;
        assertEquals("Fizz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleByFive(){
        int number = 10;
        assertEquals("Buzz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleHasFiveInit(){
        int number = 52;
        assertEquals("Buzz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleForFizzBuzz(){
        int number = 15;
        assertEquals("FizzBuzz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleForFizzBuzzHasThreeInItAndDivisibleByFive(){
        int number = 35;
        assertEquals("FizzBuzz", FizzBuzzSolution.checkFizzBuzz(number));
    }

    @Test
    public void testCheckFizzBuzzDivisibleForFizzBuzzHasFiveInItAndDivisibleByThree(){
        int number = 51;
        assertEquals("FizzBuzz", FizzBuzzSolution.checkFizzBuzz(number));
    }

}
