package org.exercism.calculatorcondrum;

public class CalculatorCondrum {
    public static void main(String[] args) {
        System.out.println(calculate(1, 20, null));
    }

    public static String calculate(int operand1, int operand2, String operation) {
        int result = 0;
        String message = "";
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        try {
            switch (operation.toLowerCase()) {
                case "+":
                    message = String.valueOf(operand1) + " " + operation + " " + operand2 + " = " + (operand1 + operand2);
                    break;
                case "*":
                    message = String.valueOf(operand1) + " " + operation + " " + operand2 + " = " + (operand1 * operand2);
                    break;
                case "/":
                    message = String.valueOf(operand1) + " " + operation + " " + operand2 + " = " + (operand1 / operand2);
                    break;
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    //eccezione custom su exercism
                    //throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            //eccezione custom su exercism
            //throw  new IllegalOperationException("Division by zero is not allowed", e);
        }
        return message;
    }
}
