package org.example.lesson3.task2;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
 * Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
 * Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {

    private static int count;

    public static void main(String[] args) {
        add();
    }
    private static int add() {
        boolean start = true;
        while (start) {
            count++;
            System.out.println(count);
        }
        return count;
    }

    @Override
    public void close() throws Exception {
        if (add() > 1000) {
            throw new Exception();
        }
    }
}
