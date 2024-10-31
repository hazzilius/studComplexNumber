public class Complex {
    private double x;
    private double y;

    public Complex(){}

    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Complex add(Complex sNumber){
        return new Complex(x+sNumber.getX(),y+sNumber.getY());
    }

    public Complex sub(Complex sNumber){
        return new Complex(x-sNumber.getX(),y-sNumber.getY());
    }

    public Complex mul(Complex sNumber){
        return new Complex(x*sNumber.getX()-y*sNumber.getY(),x*sNumber.getY()+y*sNumber.getX());
    }

    public String str() {
        return "("+x+"+"+y+"i)";
    }
}
