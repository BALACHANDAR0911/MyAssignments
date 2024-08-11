package week3Day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String[] words = text.split(" ");
        int count;     
        // Nested for loop to compare each word with others
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i + 1; j < words.length; j++) {
                // Use equalsIgnoreCase for case-insensitive comparison
                if(words[i].equalsIgnoreCase(words[j])) {
                    words[j] = ""; // Replace duplicate with empty string
                    count++;
                }
            }
        }
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals("")) {
                System.out.print(" "); // Maintain the space for the removed word
            } else {
                System.out.print(words[i] + " ");
            }
        }
	}

}