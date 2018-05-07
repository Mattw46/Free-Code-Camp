package org.freecodecamp.basic;

public class ReverseString {
    
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    void testReverseString() throws AssertionError {
        System.out.println("Testing Reverse String");
	    assert reverseString("Hello") instanceof String;
        assert reverseString("Hello").equals("olleH");
        //assert reverseString("Hello").equals("elloh");
        assert reverseString("Howdy").equals("ydwoH");
        assert reverseString("Greetings from Earth").equals("htraE morf sgniteerG");
	    System.out.println("Reverse String Passed");   
    }
}
