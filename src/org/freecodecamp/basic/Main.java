package org.freecodecamp.basic;

public class Main {

    public static void main(String[] args) {
	    // write your code here
	    
	    TestDriver td = new TestDriver();
	    if (td.runTests()) {
	        System.out.println("*** All Tests Passed ***");
	    } else {
	       System.out.println("*** Execution Terminated ***");   
        }

    }
    
     static void testFactorialize() {
        System.out.println("Testing Factorialize");
        // return int
        //assert Integer.class.isInstance(algs.factorialize(5));
        // 5 return 120
        // 10 return 3628800
        // 20 return 2432902008176640000
        // 0 return 1
        System.out.println("Factorialize passed");
    }
}
