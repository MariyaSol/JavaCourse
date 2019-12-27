package task_8;


public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private int numberOfCorners=3;



    public Triangle(double a, double b, double c )
    {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    @Override
    public double getPerimeter() {
        return a+b+c ;
    }

    @Override
    public int getCornersNumber() {
        return numberOfCorners;
    }
}
