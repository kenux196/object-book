package org.kenux.chapter06.eventloop;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(RecurringSchedule schedule) {
        if (from.getDayOfWeek() != schedule.getDayOfWeek() ||
                !from.toLocalTime().equals(schedule.getFrom()) ||
                !duration.equals(schedule.getDuration())) {
//            reschedule(schedule); // 쿼리 안에서 부수효과를 발생시키는 코드가 들어가서 명령과 쿼리 구분이 모호하고, 버그를 양산한다.
            return false;
        }

        return true;
    }

    public void reschedule(RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(dayDistance(schedule)), schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long dayDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
