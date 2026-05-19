package com.examples.models;

import com.examples.interfaces.Detectable;

import java.time.LocalDate;

public abstract class Multimedia implements Detectable {

    private String fileName;
    private LocalDate creationDate;

    public Multimedia(String fileName, LocalDate creationDate) {
        this.fileName = fileName;
        this.creationDate = creationDate;
    }

    // Subclasses declare which AI era they belong to
    protected abstract LocalDate getAiCutoffDate();

    @Override
    public boolean isAI() {
        return creationDate.isAfter(getAiCutoffDate())
                && fileName.toLowerCase().contains("ai");
    }

    public String getFileName() {
        return fileName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
