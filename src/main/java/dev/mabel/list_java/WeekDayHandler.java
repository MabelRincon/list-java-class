package dev.mabel.list_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
