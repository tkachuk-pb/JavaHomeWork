package com.pb.Tkachuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in); // сделал vvod че вводить
        int operand1; // это будет число первое operand1
        // просим указать первое число
        System.out.print("Введите любое число: ");
        operand1 = vvod.nextInt();
        // если (if) число равно 0 или больше и (&&) не больше 14 - сработал первый if и т.д.
        if (operand1 >=0 && operand1 <= 14) {
            System.out.println("Число попадает в промежуток [0 -14] ");
        }else if  (operand1 >=15 && operand1 <= 35){
            System.out.println("Число попадает в промежуток [15 - 35] ");
        }else if  (operand1 >=36 && operand1 <= 50){
            System.out.println("Число попадает в промежуток [36 - 50] ");
        }else if  (operand1 >=51 && operand1 <= 100){
            System.out.println("Число попадает в промежуток [51 - 100] ");
            // если указываем число больше 100 выводить будет этот блок
        } else { System.out.println("Число  не попадает в промежутки [0 -14] [15 - 35] [36 - 50] [51 - 100]");
                    }


    }
}
