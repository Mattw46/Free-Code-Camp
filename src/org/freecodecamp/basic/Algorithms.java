package org.freecodecamp.basic;

public class Algorithms {
    
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    /* return the factorial of num */
    public int factorialize(int num) {
        if (num == 0) { return 1; }
        int sum = 0;
        int ctr = 1;
        while (ctr <= num) {
            sum += ctr++;          
        }
        return sum;
    }
}
