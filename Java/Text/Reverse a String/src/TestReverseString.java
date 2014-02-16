public class TestReverseString {
    /* test class for ReverseString */

    public static void main(String[] args) {

        String input1 = "Java is cool";
        String input2 = "a";
        String input3 = "";

        ReverseString test1 = new ReverseString(input1);
        ReverseString test2 = new ReverseString(input2);
        ReverseString test3 = new ReverseString(input3);

        String output1 = test1.reverse();
        String output2 = test2.reverse();
        String output3 = test3.reverse();

        if (output1.equals("looc si avaJ")) {
            System.out.println("Test1 passed");
        }
        if (output2.equals("a")) {
            System.out.println("Test2 passed");
        }
        if (output3.equals("")) {
            System.out.println("Test3 passed");
        }
    }
}
