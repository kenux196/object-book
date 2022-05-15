package org.kenux.chapter12;

import org.kenux.chapter12.lecture.Grade;
import org.kenux.chapter12.lecture.GradeLecture;
import org.kenux.chapter12.lecture.Lecture;

import java.util.Arrays;

public class LectureTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Lecture lecture = new Lecture(
                "객체지향 프로그래밍", 70, Arrays.asList(81, 95, 75, 50, 45));

        String evaluate = lecture.evaluate();
        System.out.println("evaluate = " + evaluate);
    }

    private static void test2() {
        Lecture lecture = new GradeLecture(
                "객체지향 프로그래밍", 70,
                Arrays.asList(
                        new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)),
                Arrays.asList(81, 95, 75, 50, 45));

        String evaluate = lecture.evaluate();
        System.out.println("evaluate = " + evaluate);
    }
}
