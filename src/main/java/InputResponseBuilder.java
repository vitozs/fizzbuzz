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
    private void addStringToResultIfEqualsOrDivisible(String resultAppend, Integer constant){
        addStringIfDivisible(resultAppend, constant);
        addStringIfContainsNumber(resultAppend, constant);
    }
    private void addStringIfDivisible(String resultAppend, Integer constant){
        if(userInput % constant == 0){
            this.result += resultAppend;
        }
    }
    private void addStringIfContainsNumber(String resultAppend, Integer constant){
        String numVerifier = userInput.toString();

        if(numVerifier.contains(constant.toString()) && userInputHasTwoDigits()){
            this.result += resultAppend;
        }
    }
    private boolean userInputHasTwoDigits(){
        return userInput >= 10;
    }
}
