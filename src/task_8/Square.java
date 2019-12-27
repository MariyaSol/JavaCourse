package task_8;

public class Square implements Figure{
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private  int numberOfCorners = 4;

    public Square(double a1, double a2, double a3, double a4)
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    @Override
    public double getPerimeter() {
        return a1+a2+a3+a4;
    }

    @Override
    public int getCornersNumber() {
        return numberOfCorners;
    }
}
