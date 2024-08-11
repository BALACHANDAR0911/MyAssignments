package week3Day1;

public class ReverseOddindex {

	public static String reverseOddWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate over the words and their positions
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                // Keep the word as it is for even positions (1st, 3rd, 5th, ...)
                result.append(words[i]);
            } else {
                // Reverse the word if the position is odd (2nd, 4th, 6th, ...)
                char[] charArray = words[i].toCharArray();
                for (int j = charArray.length - 1; j >= 0; j--) {
                    result.append(charArray[j]);
                }
            }
            // Append a space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        // Return the result as a string
        return result.toString();
    }

    public static void main(String[] args) {
        // Test the function with the provided input
        String input = "I am a software tester";
        String output = reverseOddWords(input);
        System.out.println(output);  // Expected output: "I ma a erawtfos tester"
    }
	}