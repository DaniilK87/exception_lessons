package org.example.homework2.task3;


/**
 * Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
 * При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
 * Если b равен нулю, программа должна вернуть результат равный нулю.
 * После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
 * Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 */
public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}

class Expr {

    public static double expr(int a, int b) {
        printSum(a,b);
        double result = 0;
        if (b == 0) {
            return result;
        } else {
            result = (double) a / b;
        }
        return result;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);

    }
}
