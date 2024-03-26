public class InputResponseBuilder {
    private final Integer FIZZ = 3;
    private final Integer BUZZ = 5;
    private final Integer userInput;
    private String result = "";
    public InputResponseBuilder(Integer userInput){
        this.userInput = userInput;
    }
    public String generateResult(){
        addStringToResultIfEqualsOrDivisible("Fizz", FIZZ);
        addStringToResultIfEqualsOrDivisible("Buzz", BUZZ);
        return this.result;
    }
    public void addStringToResultIfEqualsOrDivisible(String resultAppend, Integer constant){
        addStringIfDivisible(resultAppend, constant);
        addStringIfContainsNumber(resultAppend, constant);
    }
    public void addStringIfDivisible(String resultAppend, Integer constant){
        if(userInput % constant == 0){
            this.result += resultAppend;
        }
    }
    public void addStringIfContainsNumber(String resultAppend, Integer constant){
        String numVerifier = userInput.toString();

        if(numVerifier.contains(constant.toString()) && userInputHasTwoDigits()){
            this.result += resultAppend;
        }
    }
    public boolean userInputHasTwoDigits(){
        return userInput >= 10;
    }
    public String getResult(){
        return result;
    }
}
