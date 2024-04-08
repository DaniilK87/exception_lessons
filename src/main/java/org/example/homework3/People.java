package org.example.homework3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Форматы данных:
 *
 * фамилия, имя, отчество - строки
 * дата _ рождения - строка формата dd.mm.yyyy
 * номер _ телефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 *
 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает, вернуть код ошибки,
 * обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
 *
 * Приложение должно распарсить полученную строку и выделить из них требуемые значения.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 *
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
 * <Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>
 *
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * Не забудьте закрыть соединение с файлом.
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
public class People {

    private String name;
    private String surname;
    private String last_name;
    private String birthday;
    private long telephone_number;
    private char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(long telephone_number) {
        this.telephone_number = telephone_number;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telephone_number=" + telephone_number +
                ", gender=" + gender +
                '}';
    }
}
