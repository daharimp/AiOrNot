package com.examples.models;

import java.time.LocalDate;

public class Video extends Multimedia {

    private static final LocalDate AI_VIDEO_DATE = LocalDate.of(2024, 2, 15);

    public Video(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    protected LocalDate getAiCutoffDate() {
        return AI_VIDEO_DATE;
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing video content of: " + getFileName());
    }
}
