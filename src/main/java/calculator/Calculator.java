package calculator;

import static java.lang.Math.sqrt;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float reverse(int b) {
        return (float) 1 / b;
    }

    public float square_root(int value1) {
        return  (float) sqrt(value1);
    }
}