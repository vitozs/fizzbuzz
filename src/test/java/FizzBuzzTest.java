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

}
