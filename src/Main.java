import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {

            Tasks t = new Tasks();


            //"1. Создать двумерный массив строковых данных. Пользователь вводит с консоли два произвольных числа
            //(в рамках размера массива) и приложение выводит соответствующий элемент массива"
            //t.getMatrixNumber();


            //1. Напишите программу, которая выводит все числа, которые делятся на 5 от 2 до 50 включительно.
            //System.out.println(t.numbersDivisibleBy5());


            //2. Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с
            //клавиатуры
            //t.multiplicationTable();


            //3. Пользователь вводит с консоли число.Если оно четное - прибавить к нему 1 и вывести на экран
            //результат, если оно не четное - то отнять от него 3 и вывести на экран результат, если ноль - вывести
            //на экран " Hello World !"
            //t.PrintInputValue();


            //4. Задан массив из 10 числе.Найти минимальное и максимальное значение в нем
            //t.MinMax();

            //
            //PetShop pSh = new PetShop(15, PetShop.Gender.MALE,11.5, PetShop.Animal.PENGUIN);
            //System.out.println(pSh.sumPrice(2));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("неправильный индекс массива: " + e);
        } catch (InputMismatchException e) {
            System.out.println("неправильный тип индекса массива: " + e);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("неправильный входной парметр: " + e);

        }


    }


}
