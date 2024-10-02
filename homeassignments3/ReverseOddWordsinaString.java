package homeassignments3;
public class ReverseOddWordsinaString {

public static void main(String[] args) {
    // Input string
    String text = "I am a software tester";

    // Split the text into an array of words
    String[] words = text.split(" ");
    
    // Loop through each word
    for (int i = 0; i < words.length; i++) {
        // Check if the index is odd
        if (i % 2 != 0) {
            // Convert the word to a character array
            char[] charArray = words[i].toCharArray();
            
            // Print even-positioned characters of the character array
            System.out.print("Even-positioned characters in word '" + words[i] + "': ");
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) { // Print characters at even positions
                    System.out.print(charArray[j]);
                }
            }
            System.out.println(); // Move to the next line after each word
        }
    
}
    }
}

