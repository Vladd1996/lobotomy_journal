package com.example.lobotomyjournal.anomalyspackages;

public class ManagerialWork {
    private String workName;
    private String workDescription;

    public ManagerialWork(String workName, String workDescription) {
        this.workName = workName;
        this.workDescription = workDescription;
    }

    // Геттеры
    public String getWorkName() { return workName; }
    public String getWorkDescription() { return workDescription; }
}
