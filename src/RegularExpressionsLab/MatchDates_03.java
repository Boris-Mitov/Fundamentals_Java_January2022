package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b(?<date>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String datesStrings = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(datesStrings);

        while (dates.find()) {
            String date = dates.group("date");
            String month = dates.group("month");
            String year = dates.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", date, month, year);
        }

    }
}