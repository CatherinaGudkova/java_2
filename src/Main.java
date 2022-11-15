import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String expression = "10 - 8 / (9 + 1 ) * (1 - 5) + 2";
        System.out.println("Инфиксная нотация:         " + expression);
        System.out.println("\tРезультат 15.2");

        Map<String, Integer> MAIN_MATH_OPERATIONS;
        MAIN_MATH_OPERATIONS = new HashMap<String, Integer>();
        MAIN_MATH_OPERATIONS.put("*", 1);
        MAIN_MATH_OPERATIONS.put("/", 1);
        MAIN_MATH_OPERATIONS.put("+", 2);
        MAIN_MATH_OPERATIONS.put("-", 2);

        MathExpression math_expression=new MathExpression();
        String rpn = math_expression.sort_position(expression, MAIN_MATH_OPERATIONS);
        System.out.println("Обратная польская нотация: " + rpn);
        System.out.println("\tРезультат " + math_expression.calculateExpression(expression));
    }
}