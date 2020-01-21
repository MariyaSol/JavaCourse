package task_12;

public class IntegerTextInput extends TextInput{
    @Override
    boolean Validate() {
        try {
            Integer.parseInt(this.Str.toString());
            System.out.println("в строке число и оно целое");
            return true;
        } catch (Exception e) {
            return false;

        }
    }
}


