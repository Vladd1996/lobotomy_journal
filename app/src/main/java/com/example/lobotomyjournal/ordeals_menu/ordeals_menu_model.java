package com.example.lobotomyjournal.ordeals_menu;
public class ordeals_menu_model
{
    String ordeal_color_name;
    int col;
    public ordeals_menu_model(String ordeal_color_name,int col) {
        this.ordeal_color_name = ordeal_color_name;
        this.col=col;
    }

    public String getOrdeal_color_name() {
        return ordeal_color_name;
    }
    public int getCol() {
        return col;
    }
}