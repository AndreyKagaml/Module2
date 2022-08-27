package kahamlyk.task1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class DateOfString {
    public static void main(String[] args) {

        List<String> inputDates = new ArrayList<>();
        fillOutList(inputDates);
        System.out.println(outputDate(inputDates));
    }

    public static List<String> outputDate(List<String> list){
        List<String> outputDates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if( formatDate(list.get(i))!=null)
            {
                try {
                    //    LocalDate localDate = LocalDate.parse(formatDate(inputDates.get(i)));
                    outputDates.add(LocalDate.parse(formatDate(list.get(i))).format(DateTimeFormatter.ofPattern("yyyyMMdd")));
                } catch (DateTimeParseException exception)
                {
                    exception.getParsedString();
                }
            }
        }
        return outputDates;
    }

    public static String formatDate(String date){

        if(date.length()==10) {
            if (date.charAt(2) == '/' && date.charAt(5) == '/') {
                String[] a = date.split("/");
                return a[2] + "-" + a[1] + "-" + a[0];
            } else if (date.charAt(4) == '/' && date.charAt(7) == '/') {
                String[] a = date.split("/");
                return a[0] + "-" + a[1] + "-" + a[2];
            } else if (date.charAt(2) == '-' && date.charAt(5) == '-') {
                String[] a = date.split("-");
                return a[2] + "-" + a[0] + "-" + a[1];
            } else return null;
        } else return null;
    }

    public static void fillOutList(List<String> list){
        list.add("2022/08/12");
        list.add("12/08/2022");
        list.add("08-12-2022");
        list.add("23/05/2020");
        list.add("08-02-2020");
        list.add("08/2022/01");
        list.add("ff/kj/kfld");
    }

}

