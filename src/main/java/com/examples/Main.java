package com.examples;

import com.examples.models.Image;
import com.examples.models.Text;
import com.examples.models.Video;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("vacation.mp4", LocalDate.now());
        Image image1 = new Image("photo.jpg", LocalDate.now());
        Text t1 = new Text("report.txt", LocalDate.now());

        Text t2 = new Text("AI_report.txt", LocalDate.of(2024, 5, 10));

        System.out.println("v1 isAI: " + v1.isAI());           // false — no "ai" in name
        System.out.println("image1 isAI: " + image1.isAI());   // false — no "ai" in name
        System.out.println("t1 isAI: " + t1.isAI());           // false — no "ai" in name
        System.out.println("t2 isAI: " + t2.isAI());           // true  — name has "ai" and date is after 2022-11-30
    }
}
