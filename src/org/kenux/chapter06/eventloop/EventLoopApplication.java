package org.kenux.chapter06.eventloop;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventLoopApplication {
    public static void main(String[] args) {
        Event event = new Event(
                "회의",
                LocalDateTime.of(2022, 3, 10, 10, 20),
                Duration.ofMinutes(30));


        RecurringSchedule schedule = new RecurringSchedule(
                "회의",
                DayOfWeek.WEDNESDAY,
                LocalTime.of(10, 30),
                Duration.ofMinutes(30));

        if (!event.isSatisfied(schedule)) {
            event.reschedule(schedule);
        }
    }
}