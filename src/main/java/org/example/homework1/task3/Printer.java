package org.example.homework1.task3;

import java.util.Arrays;

//Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
//и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//
//Если длины массивов не равны - верните нулевой массив длины 1.

public class Printer {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}

class Answer {
    public int[] divArrays(int[] a, int[] b){
        int [] c = new int[a.length];
        if (a.length != b.length) return c = new int[]{0};
        else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
        }
        return c;
    }
}
