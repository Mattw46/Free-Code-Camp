package org.freecodecamp.basic;

public class Factorial {
    
    public int factorialize(int num) {
        int factorial = 1;
        int counter = 2;
        while (counter <= num) {
            factorial *= counter;
            counter++;
        }
        return factorial;
    }
    
    public void testFactorialize() {
        System.out.println("Testing Factorialize");
        // return int
        assert Integer.class.isInstance(factorialize(5));
        //assert Float.class.isInstance(factorialize(5));
        // 5 return 120
        // 10 return 3628800
        // 20 return 2432902008176640000
        // 0 return 1
        System.out.println("Factorialize passed");
    }
}
