package br.edu.catolica.ppi.primeiro_exemplo.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate stringToLocalDate(String date){
        return LocalDate.parse(date, FORMATTER);
    }

}
