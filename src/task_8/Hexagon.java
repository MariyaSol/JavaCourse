package task_8;

public class Hexagon implements Figure{
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;
    private double a6;
    private int numberOfCorners=6;


    public Hexagon (double a1,double a2,double a3,double a4,double a5,double a6)
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
    }

    @Override
    public double getPerimeter() {
        return a1+a2+a3+a4+a5+a6;
    }

    @Override
    public int getCornersNumber() {
        return numberOfCorners;
    }
}
