package com.examples.models;

import java.time.LocalDate;

public class Image extends Multimedia {

    private static final LocalDate AI_IMAGE_DATE = LocalDate.of(2021, 1, 5);

    public Image(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    protected LocalDate getAiCutoffDate() {
        return AI_IMAGE_DATE;
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing image content of: " + getFileName());
    }
}
