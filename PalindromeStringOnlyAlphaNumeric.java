import java.util.Scanner;

public class PalindromeStringOnlyAlphaNumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.isPalindrome(str));
    }
}
class CheckPalindrome {
    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}