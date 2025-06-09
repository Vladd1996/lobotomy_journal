package com.example.lobotomyjournal;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.anomalyspackages.anomalitys;
import com.example.lobotomyjournal.sephirahs.sephiras;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainMenuInterface{
    int[] options_image={R.drawable.main_menu_tree1,R.drawable.anomaly_main_menu_image,R.drawable.ordeals_main_menu};
    ArrayList<MainMenuModel> main_menu=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            RecyclerView recyclerView=findViewById(R.id.MainMenuRec);
            setMain_menu();
            MainMenuRecyclerViewAdapter adapter=new MainMenuRecyclerViewAdapter(main_menu,this,this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            return insets;
        });
    }
private void setMain_menu()
{
    String[] MainMenuNumbers=getResources().getStringArray(R.array.mainmenutext);
    for(int i=0;i<MainMenuNumbers.length;i++)
    {
        main_menu.add(new MainMenuModel(MainMenuNumbers[i],options_image[i]));
    }
}

    @Override
    public void onItemClick(int position)
    {
        if(position==0)
        {
            Intent intent=new Intent(this, sephiras.class);
            startActivity(intent);
        }
        else if(position==1)
        {
            Intent intent=new Intent(this, anomalitys.class);
            startActivity(intent);
        }
        else if(position==2)
        {
            Intent intent=new Intent(this,ordeals.class);
            startActivity(intent);
        }
    }
}