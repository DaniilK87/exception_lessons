package org.example.homework3;

import java.text.ParseException;

public class DateFormatException extends ParseException {

    public DateFormatException(String s, int errorOffset) {
        super(s, errorOffset);
    }

}
