package org.freecodecamp.basic;

public class Main {

    public static void main(String[] args) {
	    // write your code here
	    Algorithms algs = new Algorithms();
	    
	    testReverseString(algs);
	    
    }
    
    static void testReverseString(Algorithms algs) {
        System.out.println("Testing Reverse String");
	    assert algs.reverseString("Hello") instanceof String;
	    System.out.println("reverse of \"Hello\": " + algs.reverseString("Hello"));
        assert algs.reverseString("Hello").equals("olleH");
        //assert algs.reverseString("Hello").equals("elloh");
	    System.out.println("Reverse String Passed");   
    }
}
