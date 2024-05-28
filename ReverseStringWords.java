public class ReverseStringWords {
    public static void main(String[] args) {
        String str = "Hello World";
        ReverseStringWords reverseStringWords = new ReverseStringWords();
        System.out.println("Original string : " + str);
        System.out.println("Reversed string : " + reverseStringWords.reverseWords(str));
    }
    String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        return reversedString.toString().trim();
    }
}