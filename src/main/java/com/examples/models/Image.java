package com.examples.models;

import com.examples.interfaces.Detectable;

import java.time.LocalDate;

public class Image extends Multimedia implements Detectable {

    private static final LocalDate AI_IMAGE_DATE = LocalDate.of(2021, 1, 5);

    public Image(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing image content of: " + getFileName());
    }

    @Override
    public boolean isAI() {
        return getCreationDate().isAfter(AI_IMAGE_DATE)
                && getFileName().toLowerCase().contains("ai");
    }
}
