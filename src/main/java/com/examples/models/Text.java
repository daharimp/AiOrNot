package com.examples.models;

import java.time.LocalDate;

public class Text extends Multimedia {

    private static final LocalDate AI_TEXT_DATE = LocalDate.of(2022, 11, 30);

    public Text(String fileName, LocalDate creationDate) {
        super(fileName, creationDate);
    }

    @Override
    protected LocalDate getAiCutoffDate() {
        return AI_TEXT_DATE;
    }

    @Override
    public void analyseContent() {
        System.out.println("Analysing text content of: " + getFileName());
    }
}
