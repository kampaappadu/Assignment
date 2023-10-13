public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input to lowercase for case-insensitive check
        boolean[] alphabet = new boolean[26]; // An array to mark the presence of each alphabet letter

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true; // Mark the letter as present
            }
        }

        // Check if all alphabet letters are marked as present
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters are present, so it's a pangram
    }
}
