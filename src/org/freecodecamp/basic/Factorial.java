package org.freecodecamp.basic;

public class Factorial {
    
    public long factorialize(long num) {
        long factorial = 1;
        long counter = 2;
        while (counter <= num) {
            factorial *= counter;
            counter++;
        }
        return factorial;
    }
    
    public void testFactorialize()  throws AssertionError {
        
        System.out.println("Testing Factorialize");
        // return int
        assert Long.class.isInstance(factorialize(5));
        //assert Float.class.isInstance(factorialize(5));
        // 5 return 120
        assert factorialize(5) == 120;
        // 10 return 3628800
        assert factorialize(10) == 3628800;
        // 20 return 2432902008176640000
        assert factorialize(20) == 2432902008176640000L;
        // 0 return 1
        assert factorialize(0) == 1;
        System.out.println("Factorialize passed");
    }
}


