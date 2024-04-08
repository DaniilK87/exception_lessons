package org.example.lesson3.task3;

/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 *
 * 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией,
 * в какой именно ячейке лежат неверные данные.
 * 2. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета
 * (сумму элементов, при условии что подали на вход корректный массив).
 */
public class Main {


    public static void main(String[] args) {
        String [][] arr = {{"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}};
        try {
            System.out.println(getArray(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Произошло исключение "  + e.getMessage());
        }

    }

    public static int getArray(String [][] array) {
        int a = 0;
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        a +=  Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i,j);
                    }

                }

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyArraySizeException();
        }
        return a;
    }
}
