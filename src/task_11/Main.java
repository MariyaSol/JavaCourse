package task_11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //    1. Предварительно задан текст, необходимо каждое слово(слова состоит из букв)
    //поместить в коллекцию, вывести общее количество элементов коллекции, запросить ввести пользователя
    // порядковый номер элемента и направление движения по коллекции,
    //согласно введенному направлению вывести все слова начиная с заданного. "

    public static void main(String[] args) {
        String text = "ArrayList — как и Vector является реализацией динамического массива объектов. Позволяет хранить любые данные, " +
                "включая null в качестве элемента. Как можно догадаться из названия, его реализация основана на" +
                " обычном массиве. Данную реализацию следует применять, если в процессе работы " +
                "с коллекцией предплагается частое обращение к элементам по индексу. " +
                "Из-за особенностей реализации поиндексное обращение к элементам выполняется за" +
                " константное время O(1). Но данную коллекцию рекомендуется избегать, если " +
                "требуется частое удаление/добавление элементов в середину коллекции. Подробный анализ и описание" +
                " можно почитать в этом хабратопике.";


        text = text.replace(",", "")
                .replace(".", "").replace("", "")
                .replace("\"", "")
                .replace("'", "")
                .replace("— ", "");

        ArrayList<String> text_array = new ArrayList<>();


        String[] arr = text.split(" ");

        Collections.addAll(text_array, arr);

        System.out.println("Количество елементов в списке " + text_array.size());

        UserValues uv = new UserValues();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс от которого будут печататься значения списка в диапазоне от 0 до " + ((text_array.size()) - 1));
        uv.Index = in.nextInt();

        System.out.println("Введите направление ");


        for (; ; ) {

            String s = in.next();

            if (s.equals(
                    Direction.RIGHT.toString())) {
                uv.Dir = Direction.RIGHT;
                break;
            } else if (s.equals(Direction.LEFT.toString())) {
                uv.Dir = Direction.LEFT;
                break;
            }

            if (uv.Dir != null) break;
            else {
                System.out.println("Введите направление снова : RIGHT or LEFT");
            }


        }
        switch (uv.Dir) {

            case LEFT: {

                for (; uv.Index >= 0; uv.Index--) {
                    System.out.println(text_array.get(uv.Index) + "\n");
                }

            }
            case RIGHT: {

                for (; uv.Index < text_array.size(); uv.Index++) {
                    System.out.println(text_array.get(uv.Index) + "\n");
                }
            }

        }

    }

}

