package controller;

import exception.IncorrectDataException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class PetValidator {

    private static final String LATIN_REGEX = "^[\\p{IsLatin}\\s]+$";

    public void validate (String [] data){

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i=0; i < data.length; i++){
            try{
                if (i==0)
                    isValidName(data[i]);
                if (i==1)
                    isValidDate (data[i]);

            } catch (IncorrectDataException e){
                sb.append ("\n");
                sb.append(e.getMessage());
                flag = false;
            }
        }
        if (!flag){
            throw new IncorrectDataException(sb.toString());
        }
    }


    private boolean isValidName(String name) {
        name = name.replaceAll("[^\\p{Print}]", "");
        if (name.matches(LATIN_REGEX)) {
            return true;
        } else {
            throw new IncorrectDataException("в имени допустимы только буквы латиницы");
        }
    }

    private boolean isValidDate (String birthday)  {

        LocalDate date;
        Integer [] month_30 = {4, 6, 9, 11};
        int day;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            date = LocalDate.parse(birthday, formatter);
            day = date.getDayOfMonth();

        } catch (DateTimeParseException e) {
            throw new IncorrectDataException("некорректно введен формат даты");
        }

        if ((Arrays.asList(month_30).contains(date.getMonthValue()) && day > 30) ||
                (date.isLeapYear() && date.getMonthValue() == 2 && day > 29) ||
                (!date.isLeapYear() && date.getMonthValue() == 2 && day > 28)) {

            throw new IncorrectDataException("некорректно введена дата рождения");

        } else
            return true;
    }
}
