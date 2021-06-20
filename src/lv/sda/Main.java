package lv.sda;

public class Main {

    public static void main(String[] args) {
       int firstNumber;
       int secondNumber;
       int answer = 0;

       firstNumber = 10;
       secondNumber = 5;

       String operator = "/";

       if (operator.equals("+")) {
           answer = firstNumber + secondNumber;
       } else if (operator.equals("-")){
           answer = firstNumber - secondNumber;
       } else if (operator.equals("*")){
           answer = firstNumber * secondNumber;
       } else if (operator.equals("/")){
           answer = firstNumber / secondNumber;
        }
       
        System.out.println(answer);
    }

}
