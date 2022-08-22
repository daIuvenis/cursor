package enums;

import static enums.Seasons.*;

public enum Months {
    January(31, WINTER),
    February(28, WINTER),
    March(31, SPRING),
    April(30, SPRING),
    May(31, SPRING),
    June(30, SUMMER),
    July(31, SUMMER),
    August(31, SUMMER),
    September(30, AUTUMN),
    October(31, AUTUMN),
    November(30, AUTUMN),
    December(31, WINTER);

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    int days;
    Seasons seasons;

    Months(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }
}