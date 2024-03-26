public class FizzBuzz {
    public String getFizzBuzzOfNumber(Integer userInput){
        return new InputResponseBuilder(userInput).generateResult();
    }
}
