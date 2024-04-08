package org.example.lesson3.task3;

public class MyArrayDataException  extends NumberFormatException {

    public MyArrayDataException(int x, int y) {
        super("Неверные данные лежали в ячейке :" + " " + x + ", " + y);
    }
}