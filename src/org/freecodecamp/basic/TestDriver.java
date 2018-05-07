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
        return true;
    }
}
