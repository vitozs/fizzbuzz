import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputResponseBuilderTest {

    @Test
    void testUserDigitIsGreaterThanTen(){
        InputResponseBuilder builder = new InputResponseBuilder(10);
        Assertions.assertTrue(builder.userInputHasTwoDigits());
    }
    @Test
    void testUserDigitIsLowerThanTen(){
        InputResponseBuilder builder = new InputResponseBuilder(9);
        Assertions.assertFalse(builder.userInputHasTwoDigits());
    }
    @Test
    void testAppendStringIfContainsNumber(){
        InputResponseBuilder builder = new InputResponseBuilder(13);
        builder.addStringIfContainsNumber("Fizz", 3);
        Assertions.assertEquals("Fizz", builder.getResult());


    }
    @Test
    void testReturnEmptyStringIfNotContainsNumber(){
        InputResponseBuilder builder = new InputResponseBuilder(12);
        builder.addStringIfContainsNumber("Fizz", 3);
        Assertions.assertEquals("", builder.getResult());
    }
    @Test
    void testAddStringIfDivisible(){
        InputResponseBuilder builder = new InputResponseBuilder(9);
        builder.addStringIfDivisible("Fizz", 3);
        Assertions.assertEquals("Fizz", builder.getResult());
    }
    @Test
    void testDontAddStringIfNotDivisible(){
        InputResponseBuilder builder = new InputResponseBuilder(10);
        builder.addStringIfDivisible("Fizz", 3);
        Assertions.assertEquals("", builder.getResult());
    }
}
