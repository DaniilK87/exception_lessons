package org.example.homework2.task1;

/**
 * Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
 * Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
 * Если преобразование не удалось, программа выдаёт сообщение об ошибке
 * Your input is not a float number. Please, try again.
 * и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
 */

public class Printer {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "text"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}

class IsFloat {
    public static float isFloat(String input) {
        float result = 0;
        try {
            result = Float.parseFloat(input);
            return result;
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }
}
