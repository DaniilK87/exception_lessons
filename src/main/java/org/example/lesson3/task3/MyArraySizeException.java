package org.example.lesson3.task3;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public MyArraySizeException() {
        super("Размер массива не 4х4");
    }
}
