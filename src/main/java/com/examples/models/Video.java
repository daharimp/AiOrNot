package com.examples.models;

import com.examples.interfaces.Detectable;

import java.time.LocalDate;

public class Video extends Multimedia implements Detectable {

    private static final LocalDate AI_VIDEO_DATE = LocalDate.of(2024, 2, 15);

    public Video(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing video content of: " + getFileName());
    }

    @Override
    public boolean isAI() {
        return getCreationDate().isAfter(AI_VIDEO_DATE)
                && getFileName().toLowerCase().contains("ai");
    }
}
