package homeassignments3;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1"; 
		String[] words = text.split(" ");
		int count = 0;
		for (int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
					words[j] = "";
					count++;
							
				}
			}
		}
		if (count > 0) {
            System.out.println("Modified array with duplicates replaced by empty strings:");
            for (String word : words) {
                System.out.print(word + " ");
            }
        } else {
            System.out.println("No duplicates found.");
        }
	}
}
