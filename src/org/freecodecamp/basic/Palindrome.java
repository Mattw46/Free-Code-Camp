package org.freecodecamp.basic;

public class Palindrome {
    
    public boolean palindrome(String str) {
        String normalizedString = str.replaceAll("[^a-zA-Z0-9]","");
        normalizedString = normalizedString.toLowerCase();
        String reverseString;
        reverseString = new StringBuilder(normalizedString).reverse().toString();
        return normalizedString.equals(reverseString);
    }
    
    public void testPalindrome() throws AssertionError {
        System.out.println("Testing Palindrome");
        //palindrome("eye") should return a boolean.
        assert Boolean.class.isInstance(palindrome("eye"));
        //palindrome("eye") should return true.
        assert palindrome("eye") == true;
        //palindrome("_eye") should return true.
        assert palindrome("_eye") == true;
        //palindrome("race car") should return true.
        assert palindrome("race car") == true;
        //palindrome("not a palindrome") should return false.
        assert palindrome("not a palindrome") == false;
        //palindrome("A man, a plan, a canal. Panama") should return true.
        assert palindrome("A man, a plan, a canal. Panama") == true;
        //palindrome("never odd or even") should return true.
        assert palindrome("never odd or even") == true;        
        //palindrome("nope") should return false.
        assert palindrome("nope") == false;
        //palindrome("almostomla") should return false.
        assert palindrome("almostomla") == false;
        //palindrome("My age is 0, 0 si ega ym.") should return true.
        assert palindrome("My age is 0, 0 si ega ym.") == true;        
        //palindrome("1 eye for of 1 eye.") should return false.
        assert palindrome("1 eye for of 1 eye.") == false;
        
        
        System.out.println("Palindrome Passed");
        
    }
}
