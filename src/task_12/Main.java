package task_12;

public class Main {
    //Создать класс TextInput, который содержит абстрактный метод Validate и StringBuilder
    // переменную с введённой строкой, от него нужно унаследовать IntegerTextInput,
    // который валидирует, что строка — это целое число. И от IntegerTextInput унаследовать
    // FloatTextInput, который валидирует, что число целое или дробное с точкой  -
    // для этого нужно вызвать  base.Validate()
    // проверить, что число целое и если не целое тогда проверять с точкой ли оно

    public static void main(String[] args) {
        TextInput t = new FloatTextInput();

        System.out.println(t.Validate());
    }
}
