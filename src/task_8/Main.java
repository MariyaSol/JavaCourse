package task_8;

import java.util.ArrayList;

public class Main {

    //Создать интерфейс для вычисления основным свойств геометрических
    //фигур - периметра и количества углов и  реализовать его для классов
    //"Треугольник", "Квадрат", "Шестиугольник"
    public static void main(String[] args) {



        ArrayList <Figure> figures  = new ArrayList<Figure>();

        figures.add(new Triangle(1,2,3));
        figures.add(new Square(1,2,3,4));
        figures.add(new Hexagon(1,2,3,4,5,5));


        for (Figure i:figures)
        {
            System.out.println("углов - " + i.getCornersNumber() + ",   периметр - " +i.getPerimeter() + "\n");
        }

    }
}
