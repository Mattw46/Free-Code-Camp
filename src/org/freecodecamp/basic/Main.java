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
    
}
