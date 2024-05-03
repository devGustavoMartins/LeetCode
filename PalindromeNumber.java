public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
}
