package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("CALCULATOR");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter operation: ");
        String op = reader.readLine();
        reader.close();
        int res = 0;
        switch (op) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        System.out.println(res);
    }
}
