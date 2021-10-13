package com.pb.Tkachuk.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in); // сделал vvod че вводить
        int operand1; // это будет число первое operand1
        int operand2; // это будет число второе operand2
        String symbol; // это будет симол, что выводим
        // просим указать первое число
        System.out.print("Введите первое число: ");
        operand1 = vvod.nextInt();
        // просим указать второе число
        System.out.print("Введите второе число: ");
        operand2 = vvod.nextInt();
        // просим знак
        System.out.print("что желаете? +, -, *, / ");
        symbol = vvod.next();
        // Через свич смотрим +-*/ и выводим это, но если делим на 0 - ошибка. Если указали не верный знак (к примеру цыфру) - default сработает.
            switch (symbol) {
                case "+":
                    System.out.println(operand1 + operand2);
                    break;
                case "-":
                    System.out.println(operand1 - operand2);
                    break;
                case "*":
                    System.out.println(operand1 * operand2);
                    break;
                case "/":
                   if ( operand2 ==  0  ) {
                       System.out.println("Oooops, something wrong !, на ноль не делим");
                   } else       System.out.println(operand1 / operand2);
                    break;
                default:  System.out.println("Давай ещё раз, но по правилам, правильно выбирай знак");
            }

    }
}
