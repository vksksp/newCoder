//A calculator project. it can perform basic calculations ADDITION, MULTIPLICATION, SUBSTRACTION, DIVIDE.

import java.util.*;
public class calculatorSwitch {
    public static void main (String args[]){
        System.out.println("Calculator by Vikash");
        System.out.println("====================\n");

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Opertion symbol = ");
        char operand = sc.next().charAt(0);

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        float result;

        switch (operand){
            case '+' : System.out.println("Result = " +(result = num1+num2));
                        break;
            case '-' : System.out.println("Result = " +(result = num1-num2));
                        break;
            case '*' : System.out.println("Result = " +(result = num1*num2));
                        break;
            case '/' : System.out.println("Result = " +(result = (float)num1/num2));
                        break;
            case '%' : System.out.print("Result = "+(result = (float) num1/num2*100) + " %");
        } 
    } 

}
