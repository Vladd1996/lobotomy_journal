package com.example.lobotomyjournal;

public class MainMenuModel
{
    String option_name;
    int option_image;

    public MainMenuModel(String option_name, int option_image) {
        this.option_name = option_name;
        this.option_image = option_image;
    }

    public String getOpyion_name() {
        return option_name;
    }

    public int getOption_image() {
        return option_image;
    }
}
