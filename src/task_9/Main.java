package task_9;


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
            if (checkDivider(num2)) {


                System.out.println(num1 / num2);
            }


        }
        catch (DivizionByZeroException e) {

            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {

            System.out.println("Введенное вами число выходит за рамки допустимых значений ");
        }

    }
    public static boolean checkDivider(int i) throws DivizionByZeroException
    {
        if(i!=0) return true;
        else {
            throw new DivizionByZeroException("Делитель не может быть равен 0");
        }
    }
}
