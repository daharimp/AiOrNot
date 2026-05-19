package com.examples.models;

import com.examples.interfaces.Detectable;

import java.time.LocalDate;

public class Text extends Multimedia implements Detectable {

    private static final LocalDate AI_TEXT_DATE = LocalDate.of(2022, 11, 30);

    public Text(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing text content of: " + getFileName());
    }

    @Override
    public boolean isAI() {
        return getCreationDate().isAfter(AI_TEXT_DATE)
                && getFileName().toLowerCase().contains("ai");
    }
}
