package task_12;

public class FloatTextInput extends IntegerTextInput{


    public boolean Validate() {
        try {
            if( super.Validate()==false) {
                Double.parseDouble(super.Str.toString());
                boolean b = super.Str.toString().contains(".");
                if (b)System.out.println("значение является дробным числом \n");
                return b;
            }

            return false;


        }catch(Exception e) {
            return false;
        }
    }
}
