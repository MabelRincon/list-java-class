package dev.mabel.test_java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import dev.mabel.list_java.WeekDayHandler;


public class WeekDayHandlerTest {

    private WeekDayHandler weekDayHandler;

    @BeforeEach
    void setUp() {
        weekDayHandler = new WeekDayHandler();
    }

    @Test
    void testCreateWeekdaysList() {
        weekDayHandler.createWeekdaysList();
        List<String> weekdays = weekDayHandler.getWeekdays();
        assertEquals(7, weekdays.size());
        assertTrue(weekdays.contains("Monday"));
        assertTrue(weekdays.contains("Tuesday"));
        assertTrue(weekdays.contains("Wednesday"));
        assertTrue(weekdays.contains("Thursday"));
        assertTrue(weekdays.contains("Friday"));
        assertTrue(weekdays.contains("Saturday"));
        assertTrue(weekdays.contains("Sunday"));
    }

    @Test
    void testGetWeekdays() {
    weekDayHandler.createWeekdaysList();
    List<String> weekdays = weekDayHandler.getWeekdays();
    assertNotNull(weekdays);
    assertEquals(7, weekdays.size());
    assertTrue(weekdays instanceof ArrayList);
    }

    @Test
    void testGetListLength() {
    weekDayHandler.createWeekdayList();
    assertEquals(7, weekDayHandler.getListLength());
    }

}