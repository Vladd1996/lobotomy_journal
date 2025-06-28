package com.example.lobotomyjournal.sephirahs;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.R;
import com.example.lobotomyjournal.anomalyspackages.anomaly_menu_model;
import com.example.lobotomyjournal.anomalyspackages.anomaly_recycler_view_adapter;

import java.util.ArrayList;

public class sephiras extends AppCompatActivity {
    int[] sephirasicon={R.drawable.angelaportrait,R.drawable.malkuthportrait,R.drawable.yesodportrait,R.drawable.netzachportrait,
            R.drawable.hodportrait,R.drawable.tipheretaportrait,R.drawable.tipheretbportrait,R.drawable.geburaportrait,
            R.drawable.chesedportrait,R.drawable.hokmaportrait,R.drawable.binahportrait,R.drawable.aportrait};
    ArrayList<sephiras_menu_model> sephirasMenu=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sephiras);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            RecyclerView recyclerView = findViewById(R.id.sephirahs_rec_view);
            setsephirasmenu();
            sephiras_menu_adapter adapter=new sephiras_menu_adapter(this,sephirasMenu);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            return insets;
        });
    }
    private void setsephirasmenu()
    {
        String[] sephiraslayer=getResources().getStringArray(R.array.sephirahs_layer);
        String[] sephirasname=getResources().getStringArray(R.array.sephirahs_name);
        String[] sephirasdescription=getResources().getStringArray(R.array.sephirahs_description);
        for(int i=0;i<sephiraslayer.length;i++)
        {
            sephirasMenu.add(new sephiras_menu_model(sephiraslayer[i],sephirasname[i],sephirasdescription[i],sephirasicon[i]));
        }
    }
}