package org.example.lesson3.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Task0 {

    public static void main(String[] args) {
        try {
            rwLine(Path.of("text"), Path.of("text2"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            doSomething();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = Files.newBufferedReader(pathRead); BufferedWriter out = Files.newBufferedWriter(pathWrite);) {
            out.write(in.readLine());
        }

    }

    /**
     * Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого метода прописывать не обязательно).
     * Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
     */
    public static void doSomething() throws IOException {

    }
}
