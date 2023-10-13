package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        word = word.replaceAll("\\s", "").toLowerCase();

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static void main(String[] args) {
        String word = "Я несу гусеняf";
        if (isPalindrome(word)){
            System.out.println(word + " - це паліндром.");
        } else {
            System.out.println(word + " - не є паліндромом.");
        }
    }
}