package task_10;


import java.util.Scanner;

public class Main {
    //1. Дан пусть к файлу в файловой системе. Необходимо найти имя файла без расширения и вывести на экран.
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


     String puth = "D:\\Folder\\Folde\\Fold\\_file_name.png";

      int leng =   puth.split("\\\\").length;


        String [] ar = (puth.split("\\\\"));


        System.out.print(    (ar[leng-1]).split("\\.")[0]  );
    }
}
