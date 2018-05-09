package org.freecodecamp.basic;

/* Test Driver:
 * Runs tests on each class (challenge)
 */
public class TestDriver {
    
    public boolean runTests() {
        ReverseString rs = new ReverseString();
        try {
            rs.testReverseString();
        } catch (AssertionError ae) {
            System.out.println("\nReverse String: Assertion failed");
            System.out.print("Check which test failed and fix\n\n" +
                "Will now exit");
            return false;
        }
        
        Factorial fact = new Factorial();
        try {
            fact.testFactorialize();
        } catch (AssertionError ae) {
            System.out.println("\nFactorial: Assertion failed");
            System.out.print("Check which test failed and fix\n\n" +
                "Will now exit");
            return false;
        }
        
        Palindrome p = new Palindrome();
        try {
            p.testPalindrome();
        } catch (AssertionError ae) {
            System.out.println("\nPalindrome: Assertion failed");
            System.out.print("Check which test failed and fix\n\n" +
                "Will now exit");            
        }
        
        // only return once all tests have passed
        return true;
    }
}
