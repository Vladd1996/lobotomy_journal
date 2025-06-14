package com.example.lobotomyjournal.ordeals_menu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.R;

import java.util.ArrayList;

public class ordeals extends AppCompatActivity {
    ArrayList<ordeals_menu_model> Ordeals_colors_menu=new ArrayList<>();
    int[] color={R.color.Amber,R.color.Crimson,R.color.Green,
            R.color.Indigo,R.color.Violet,R.color.white};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ordeals);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //_________________________________________
            RecyclerView recyclerView = findViewById(R.id.ordeals_menu);
            set_ordeals_main_menu();
            ordeals_menu_adapter adapter=new ordeals_menu_adapter(Ordeals_colors_menu, this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            //_________________________________________
            //обрезает в меню снизу - исправить
            return insets;
        });
    }
    private void set_ordeals_main_menu()
    {
        String[] name_of_ordeals_color=getResources().getStringArray(R.array.ordeals_colors);
        for(int i=0;i<name_of_ordeals_color.length;i++)
        {
            Ordeals_colors_menu.add(new ordeals_menu_model(name_of_ordeals_color[i],color[i]));
        }
    }
}