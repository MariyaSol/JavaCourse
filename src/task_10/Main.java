package task_10;


import java.util.Scanner;

public class Main {
    //1. Дан пусть к файлу в файловой системе. Необходимо найти имя файла без расширения и вывести на экран.

    public static void main(String[] args) {


     String filePath = "D:\\Folder\\Folde\\Fold\\_file_na.e.png";


        int lastDot = filePath.lastIndexOf(".") ;
        int lastSlash = filePath.lastIndexOf("\\") +1;

       String fileName = filePath.substring(lastSlash,lastDot);

        System.out.print(  fileName  );

    }
}
