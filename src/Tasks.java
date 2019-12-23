import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public Scanner in = new Scanner(System.in);
    final Random random = new Random();


    public void getMatrixNumber() {

        String arr[][] = new String[4][4];

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                arr[i][j] = random.nextInt(100) + " years old";
            }
        }

        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.println(arr[num1][num2]);

    }

    public ArrayList<Integer> numbersDivisibleBy5() {
        //  вернуть все числа которые делять на 5 от 2 до 50 включительно
        int start = 2;
        int finish = 50;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int x = start; x <= finish; x++) {

            if ((x % 5) == 0) list.add(x);
        }
        return list;
    }

    public void multiplicationTable() {

        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        if (num1 < 1 || num1 > 10) throw new IndexOutOfBoundsException();
        else {
            for (int i = 1; i < 11; i++) {
                System.out.print(num1 + " * " + i + " = " + (num1 * i) + "\n");
            }
        }
    }

    public void PrintInputValue() {
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        if (num1 == 0) System.out.print("Hello World!");

        else if ((num1 % 2) == 0) System.out.print(++num1);
        else if (((num1 % 2) != 0)) System.out.print(num1 - 3);


    }

    public void MinMax() {

        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]+" , ");
        }

        int max=0,min=0;

        for (int i = 0; i < 10; i++) {
            if(i==0) {max=arr[i];min=arr[i];}
           if (arr[i]>max)max=arr[i];
           if (arr[i]<min)min=arr[i];
        }
        System.out.print(" min = "+min+" max = "+max);

    }


}
