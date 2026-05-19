package com.examples;

import com.examples.models.Image;
import com.examples.models.Multimedia;
import com.examples.models.Text;
import com.examples.models.Video;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Multimedia> mediaList = List.of(
                new Video("vacation.mp4",   LocalDate.now()),
                new Image("photo.jpg",      LocalDate.now()),
                new Text("report.txt",      LocalDate.now()),
                new Text("AI_report.txt",   LocalDate.of(2024, 5, 10)),
                new Image("AI_portrait.png", LocalDate.of(2023, 3, 15)),
                new Video("AI_sora_clip.mp4", LocalDate.of(2025, 1, 20))
        );

        printList(mediaList);
    }

    private static void printList(List<Multimedia> mediaList) {
        String fmt = "%-8s  %-24s  %-12s  %s%n";
        String divider = "-".repeat(58);

        System.out.println("\n  Multimedia AI Detection");
        System.out.println(divider);
        System.out.printf(fmt, "Type", "File Name", "Created", "AI?");
        System.out.println(divider);

        for (Multimedia m : mediaList) {
            System.out.printf(fmt,
                    m.getClass().getSimpleName(),
                    m.getFileName(),
                    m.getCreationDate(),
                    m.isAI() ? "YES" : "No"
            );
        }

        System.out.println(divider);
    }
}
