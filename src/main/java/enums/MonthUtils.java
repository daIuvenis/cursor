package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonthUtils {
    private static final Logger LOGGER = LogManager.getLogger(MonthUtils.class);
    private static Scanner scanner;
    private static String enteredMonth;
    private static List<String> finalMoths;

    public void mainMenu() {
        LOGGER.info("Enter the option:");
        LOGGER.info("1. Check month");
        LOGGER.info("2. Print all months in entered season");
        LOGGER.info("3. Print all months with the same days");
        LOGGER.info("4. Print all months with even days");
        LOGGER.info("5. Print all months without even days");
        LOGGER.info("6. Check if the month is even");
        scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                checkMonth();
                break;
            case 2:
                printAllMonthInSeason();
                break;
            case 3:
                printAllMonthsWithSameDays();
                break;
            case 4:
                printAllMonthsWithEvenDays();
                break;
            case 5:
                printAllMonthsWithoutEvenDays();
                break;
            case 6:
                checkThatMonthIsPair();
                break;
        }
    }

    private static void checkMonth() {
        LOGGER.info("Enter your option of month");
        scanner = new Scanner(System.in);
        enteredMonth = scanner.nextLine();
        for (Months months : Months.values()) {
            if (enteredMonth.equalsIgnoreCase(String.valueOf(months)))
                LOGGER.info("The month: '" + enteredMonth + "' is correct");
        }
    }

    private static void printAllMonthInSeason() {
        LOGGER.info("Enter your option of month");
        scanner = new Scanner(System.in);
        enteredMonth = scanner.nextLine();
        finalMoths = new ArrayList<>();
        String season = null;
        for (Months months : Months.values()) {
            season = enteredMonth.equalsIgnoreCase(String.valueOf(months)) ? String.valueOf(months.seasons) : null;
        }
        for (Months months : Months.values()) {
            assert season != null;
            if (season.equalsIgnoreCase(String.valueOf(months.seasons))) finalMoths.add(String.valueOf(months));
        }
        for (String month : finalMoths) {
            System.out.println(month);
        }
    }

    private static void printAllMonthsWithSameDays() {
        finalMoths = new ArrayList<>();
        LOGGER.info("Enter your option of days");
        int enteredDay = scanner.nextInt();
        try {
            for (Months months : Months.values()) {
                if (enteredDay == months.days) finalMoths.add(String.valueOf(months));
            }
            for (String month : finalMoths) {
                System.out.println(month);
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    private static void printAllMonthsWithEvenDays() {
        finalMoths = new ArrayList<>();
        try {
            for (Months months : Months.values()) {
                if (months.days % 2 == 0) finalMoths.add(String.valueOf(months));
            }
            for (String month : finalMoths) {
                System.out.println(month);
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    private static void printAllMonthsWithoutEvenDays() {
        finalMoths = new ArrayList<>();
        try {
            for (Months months : Months.values()) {
                if (months.days % 2 == 1) finalMoths.add(String.valueOf(months));
            }
            for (String month : finalMoths) {
                System.out.println(month);
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    private static void checkThatMonthIsPair() {
        boolean checked = false;
        LOGGER.info("Enter the month");
        scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        for (Months months : Months.values()) {
            checked = month.equalsIgnoreCase(String.valueOf(months)) && months.getDays() % 2 == 0;
            if (checked)break;
        }
        LOGGER.info(checked);
    }
}