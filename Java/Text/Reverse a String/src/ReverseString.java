public class ReverseString {

    private String inputString;

    public ReverseString(String inputString) {
        this.inputString = inputString;
    }

    /* Returns reverse of input string */
    public String reverse() {
        String outputString;

        outputString = new StringBuilder(inputString).reverse().toString();

        return outputString;
    }
}
