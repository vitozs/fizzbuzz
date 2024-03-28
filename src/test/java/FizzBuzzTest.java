import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testAddStringIfDivisible(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(9);
        inputResponseBuilder.addStringIfDivisible("Fizz", 3);
        String result = inputResponseBuilder.getResult();

        Assertions.assertEquals("Fizz", result);
    }
    @Test
    void testEmptyStringIfNotDivisible(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(2);
        inputResponseBuilder.addStringIfDivisible("Fizz", 3);
        String result = inputResponseBuilder.getResult();

        Assertions.assertEquals("", result);
    }
    @Test
    void testAddStringIfContainsNumber(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(32);
        inputResponseBuilder.addStringIfContainsNumber("Fizz", 3);
        String result = inputResponseBuilder.getResult();

        Assertions.assertEquals("Fizz", result);
    }
    @Test
    void testEmptyStringIfNotContainsNumber(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(22);
        inputResponseBuilder.addStringIfContainsNumber("Fizz", 3);
        String result = inputResponseBuilder.getResult();

        Assertions.assertEquals("", result);
    }
    @Test
    void testUserInputHasTwoOrMoreDigits(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(10);

        Assertions.assertTrue(inputResponseBuilder.userInputHasTwoDigits());
    }
    @Test
    void testUserInputHasOneDigit(){
        InputResponseBuilder inputResponseBuilder = new InputResponseBuilder(7);

        Assertions.assertFalse(inputResponseBuilder.userInputHasTwoDigits());
    }
    @Test
    void testForMultipleOfThree(){
        Assertions.assertEquals("Fizz", fizzBuzz.getFizzBuzzOfNumber(9));
    }
    @Test
    void testForMultipleOfFive(){
        Assertions.assertEquals("Buzz", fizzBuzz.getFizzBuzzOfNumber(10));
    }
    @Test
    void testForMultipleOfBoth(){
        Assertions.assertEquals("FizzBuzzBuzz", fizzBuzz.getFizzBuzzOfNumber(15));
    }
    @Test
    void test(){
        Assertions.assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzOfNumber(53));
    }

}
