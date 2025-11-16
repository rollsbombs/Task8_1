package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StudentWithClock extends Student {
    public void learn() {
        System.out.println("Я учусь. .zZ)");
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Текущее время: " + currentTime.format(formatter));
        System.out.println("Я закончил учиться");
    }

}
