package org.example.homework3;

import java.io.IOException;
import java.text.ParseException;

public interface PeopleService {

    void inputData() throws ParseException;

    void writeToFile() throws IOException;
}
