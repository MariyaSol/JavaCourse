package task_9;

import org.w3c.dom.ranges.RangeException;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Пользователь вводит 2 числа с консоли. Программа должна вывести на экран результат деление одного числа
        //на другое Если во время операции деления одно из значений = 0,  то отлавливать исключение
        //и выводить на экран сообщение сообщение "Введенное вами число выходит за рамки допустимых значений"
        try {

            System.out.print("Input a first number: ");
            int num1 = in.nextInt();

            System.out.print("Input a second number: ");
            int num2 = in.nextInt();


            System.out.println( num1 / num2);



        } catch (ArithmeticException e) {

            System.out.println("Введенное вами число выходит за рамки допустимых значений ");
        }
    }
}
