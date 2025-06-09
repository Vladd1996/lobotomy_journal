package com.example.lobotomyjournal.sephirahs;

public class sephiras_menu_model
{
    String name,description,layer;
    int image;

    public sephiras_menu_model(String layer, String name,String description, int image) {
        this.description = description;
        this.name = name;
        this.layer = layer;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getLayer() {
        return layer;
    }

    public int getImage() {
        return image;
    }
}
