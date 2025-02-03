package dev.mabel.list_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class WeekDayHandler {

    private List<String> weekdays;

    public WeekDayHandler() {
        weekdays = new ArrayList<>();
    }

    public void createWeekdaysList() {
        weekdays.addAll(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public List<String> getWeekdays() {
        return new ArrayList<>(weekdays);
    }

    public int getListLength() {
        return weekdays.size();
    }

    public void removeWeekday(String day) {
        weekdays.remove(day);
    }

    public String getRequestedWeekday(String day) {
        if (weekdays.contains(day)) {
            return day;
        }
        return null;
    }

    public boolean weekDayExists(String day) {
        return weekdays.contains(day);
    }

    public void sortWeekdaysAlphabetically() {
        Collections.sort(weekdays);
    }

    public void emptyWeekdays() {
        weekdays.clear();
    }

}
