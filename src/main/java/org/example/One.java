package org.example;

public class One {
    private double x;
    private double y;

    public double res (double x){
        this.x = x;
        this.y =Math.sqrt(Math.pow(Math.abs
                (Math.acos
                        (
                                (Math.cos(Math.pow(Math.abs(x),1.0/9)))
                                        /
                                (Math.pow(Math.cos(Math.pow(Math.abs(x),1.0/9)),2)+7)
                        )
                ),9))+
                Math.log(Math.pow(2,Math.sin(3*x-1))+Math.pow(3,Math.tan(x)));
        return this.y;
    };

    public  boolean resIn(){
        if ((this.x>0)&&(this.x<6)&&(this.y<0)&&(this.y>-6)) {
            return true;
        }
        else{
            return false;
        }
    };

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
