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
    weekDayHandler.createWeekdaysList();
    assertEquals(7, weekDayHandler.getListLength());
    }

    @Test
    void testRemoveWeekday_existingDay() {
    weekDayHandler.createWeekdaysList();
    weekDayHandler.removeWeekday("Thursday");
    assertEquals(6, weekDayHandler.getListLength());
    assertFalse(weekDayHandler.getWeekdays().contains("Thursday"));
    }

    @Test
    void testRemoveWeekday_nonExistingDay() {
    weekDayHandler.createWeekdaysList();
    weekDayHandler.removeWeekday("Frieday");
    assertEquals(7, weekDayHandler.getListLength());
    }

    @Test
    void testGetRequestedWeekday_existingDay() {
    weekDayHandler.createWeekdaysList();
    String day = weekDayHandler.getRequestedWeekday(Saturday);
    assertEquals("Saturday", day);
    }

    @Test
    void testGetRequestedWeekday_nonExistingDay() {
    weekDayHandler.createWeekdaysList();
    String day = weekDayHandler.getRequestedWeekday("Humpday");
    assertNull(day);
    }


}