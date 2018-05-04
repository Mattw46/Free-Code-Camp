package org.freecodecamp.basic;

public class Main {

    public static void main(String[] args) {
	    // write your code here
	    /*Algorithms algs = new Algorithms();
	    
	    testReverseString(algs);
	    testFactorialize(algs);*/
	    
    }
    
    static void testReverseString(Algorithms algs) {
        System.out.println("Testing Reverse String");
	    assert algs.reverseString("Hello") instanceof String;
        assert algs.reverseString("Hello").equals("olleH");
        //assert algs.reverseString("Hello").equals("elloh");
        assert algs.reverseString("Howdy").equals("ydwoH");
        assert algs.reverseString("Greetings from Earth").equals("htraE morf sgniteerG");
	    System.out.println("Reverse String Passed");   
    }
    
    static void testFactorialize(Algorithms algs) {
        System.out.println("Testing Factorialize");
        // return int
        assert Integer.class.isInstance(algs.factorialize(5));
        // 5 return 120
        // 10 return 3628800
        // 20 return 2432902008176640000
        // 0 return 1
        System.out.println("Factorialize passed");
    }
}
