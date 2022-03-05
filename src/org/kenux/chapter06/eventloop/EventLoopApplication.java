package org.kenux.chapter06.eventloop;

import java.time.Duration;
import java.time.LocalDateTime;

public class EventLoopApplication {
    public static void main(String[] args) {
        Event meeting = new Event(
                "회의",
                LocalDateTime.of(2022, 3, 10, 10, 20),
                Duration.ofMinutes(30));
    }
}
