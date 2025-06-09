package com.example.lobotomyjournal.anomalyspackages;

public class anomaly_menu_model
{
    String AnomalyNumber,AnomalyCode,AnomalyName;
    int anomalyicon;

    public anomaly_menu_model(String anomalyCode, String anomalyNumber, String anomalyName, int anomalyicon) {
        AnomalyCode = anomalyCode;
        AnomalyNumber = anomalyNumber;
        AnomalyName = anomalyName;
        this.anomalyicon = anomalyicon;
    }

    public String getAnomalyCode() {
        return AnomalyCode;
    }

    public String getAnomalyNumber() {
        return AnomalyNumber;
    }

    public String getAnomalyName() {
        return AnomalyName;
    }

    public int getAnomalyicon() {
        return anomalyicon;
    }
}
