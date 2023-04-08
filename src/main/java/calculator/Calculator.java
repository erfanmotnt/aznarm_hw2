package calculator;

import static java.lang.Float.NaN;
import static java.lang.Math.sqrt;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float reverse(int b) {
        return (float) 1 / b;
    }

    public float square_root(int value) {
        return (float) sqrt(value);
    }
    public float calculate(String operation, int value) {
        if(operation.equals("rvs")) {
           return this.reverse(value);
        }
        else if(operation.equals("sqr")) {
            return this.square_root(value);
        }
        else {
            return NaN;
        }
    }
}