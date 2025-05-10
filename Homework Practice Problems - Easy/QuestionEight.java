public class QuestionEight {
    public static void main(String[] args) {
        double a=6;
        double b=2;
        char operator ='+';

        double result=0;

        if (operator == '+') {
            result = a + b;

        }
        else if (operator == '-') {
            result = a - b;
        }
        else if (operator == '*') {
            result = a * b;
        }
        else if (operator == '/') {
            if (b != 0) {
                result = a / b;
            }
        }
        System.out.println("Result:"+ result);
}
}
