package org.example.homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PeopleServiceImpl implements PeopleService{

      private final People people = new People();
      private static final int AMOUNT_OF_DATA = 6;

    @Override
    public void inputData() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите данные в следующем порядке: фамилия,имя,отчество,дата_рождения,номер_телефона,пол>");
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.next();
        String [] data = inputData.split(",");
        for (int i = 0; i < AMOUNT_OF_DATA; i++) {
            if (data.length > AMOUNT_OF_DATA)
                throw new ArrayIndexOutOfBoundsException("Вы ввели лишние данные");
            try {
                Date date = formatter.parse(data[3]);
                people.setName(data[0]);
                people.setSurname(data[1]);
                people.setLast_name(data[2]);
                people.setBirthday(formatter.format(date));
                people.setTelephone_number(Long.parseLong(data[4]));
                people.setGender(data[5].charAt(0));
            } catch (ParseException e) {
                throw new DateFormatException("Введен неверный формат даты, введите: dd.mm.yyyy", i);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Нельзя использовать символы при вводе номера телефона");
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Вы ввели недостаточно данных");
            }
        }
    }

    @Override
    public void writeToFile() {
        String fileName = people.getSurname();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));) {
            writer.write('\n');
            writer.write("<" + people.getName() + ">");
            writer.write("<" + people.getSurname() + ">");
            writer.write("<" + people.getLast_name() + ">");
            writer.write("<" + people.getBirthday() + ">");
            writer.write("<" + people.getTelephone_number() + ">");
            writer.write("<" + people.getGender() + ">");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            throw new InputDataException("ошибка при вводе, данные не сохранены");
        }
    }
}
