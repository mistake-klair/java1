package org.example;

public class Two {
    public double res (double x){
        if (x <= -2) {
            return Math.acos(Math.exp(x));
        } else if ((x>-2) &&(x<2)) {
            return Math.tan((5*x)/(4-Math.pow(x,9)));
        } else {
            return Math.pow(Math.pow(Math.abs(x - 2), x) + 1, 3);
        }
    };
}
