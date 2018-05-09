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
        
        // only return once all tests have passed
        return true;
    }
}
