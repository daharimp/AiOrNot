package com.examples.models;

import java.time.LocalDate;

public abstract class Multimedia {

    private String fileName;
    private LocalDate creationDate;

    public Multimedia(String fileName, LocalDate creationDate) {
        this.fileName = fileName;
        this.creationDate = creationDate;
    }

    public String getFileName() {
        return fileName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
