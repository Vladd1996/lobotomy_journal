package com.example.lobotomyjournal.anomalyspackages;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.MainMenuModel;
import com.example.lobotomyjournal.R;

import java.util.ArrayList;

public class anomalitys extends AppCompatActivity {
    int[] anomalyicon={R.drawable.yourebaldportrait,R.drawable.trainingstandarddummyrabbitportrait,R.drawable.scorchedgirlportrait,
            R.drawable.onesinportrait,R.drawable.thequeenofhatredportrait,
            R.drawable.happyteddybearportrait,R.drawable.redshoesportrait,R.drawable.theresiaportrait,
            R.drawable.oldladyportrait,R.drawable.namelessfetusportrait,R.drawable.wallgazerportrait,
            R.drawable.nothingthereportrait,R.drawable.mhzportrait,R.drawable.singingmachineportrait,
            R.drawable.thesilentorchestraportrait,R.drawable.warmheartedwoodsmanportrait,R.drawable.thesnowqueenportrait,
            R.drawable.bigbirdportrait,R.drawable.littlehelperportrait,R.drawable.snowwhiteappleportrait,
            R.drawable.spiderbudportrait,R.drawable.beautyandthebeastportrait,R.drawable.plaguedoctorportrait,
            R.drawable.whitenightportrait,R.drawable.donttouchmeportrait,R.drawable.rudoltaportrait,
            R.drawable.qeenbeeportrait,R.drawable.bloodbathportrait,R.drawable.openedcanofwellcheersportrait,
            R.drawable.alriuneportrait,R.drawable.forsakenmurdererportrait,R.drawable.thechildofgalaxyportrait,
            R.drawable.punishingbirdportrait,R.drawable.littleredportrait,R.drawable.bigandmightbebadwolfportrait,
            R.drawable.fragmentoftheuniverseportrait,R.drawable.crumblingarmorportrait,R.drawable.birdofjudgementportrait,
            R.drawable.apocalypsebirdportrait,R.drawable.thekingofgreedportrait,R.drawable.thelittleprinceportrait,
            R.drawable.laetitiaportrait,R.drawable.funeralofthedeadbutterfliesportrait,R.drawable.derfreischftzportrait,
            R.drawable.dreamofablackswanportrait,R.drawable.thedreamingcurrentportrait,R.drawable.theburrowingheavenportrait,
            R.drawable.theknightofdespairportrait,R.drawable.thenakednestportrait,R.drawable.themountainofsmilingbodiesportrait,
            R.drawable.schfreude,R.drawable.theheartofaspirationportrait,R.drawable.notefromacrazedresearcherportrait,
            R.drawable.fleshidolportrait,R.drawable.gianttreesapportrait,R.drawable.mirrorofadjustmentportrait,
            R.drawable.shelterfromthemarchportrait,R.drawable.fairyfestivalportrait,R.drawable.meatlanternportrait,
            R.drawable.wecanchangeanythingportrait,R.drawable.expresstraintohellportrait,R.drawable.scarecrowsearchingforwisdomportrait,R.drawable.dimensionalrefractionvariantportrait,
            R.drawable.censoredportrait,R.drawable.prophecyoftheskinportrait,R.drawable.portraitofanotherworldportrait,R.drawable.shylooktodayportrait,
            R.drawable.bluestarportrait,R.drawable.youmustbehappyportrait,R.drawable.luminousbraceletportrait,R.drawable.behavioradjustmentportrait,
            R.drawable.oldbeliefandpromiseportrait,R.drawable.porccubusportrait,R.drawable.voiddream,R.drawable.graveofcherryblossomsportrait,
            R.drawable.firebird,R.drawable.yin,R.drawable.yan,R.drawable.backwardclockportrait,
            R.drawable.lalunaportrait,R.drawable.armyinblackportrait,R.drawable.ppodaeportrait,R.drawable.parasytetreeportrait,
            R.drawable.meltingloveportrait,R.drawable.heroicmonkportrait};
    ArrayList<anomaly_menu_model> anomaly_menu=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anomalitys);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            RecyclerView recyclerView = findViewById(R.id.anomaly_main_menu);
            setAnomaly_menu();
            anomaly_recycler_view_adapter adapter=new anomaly_recycler_view_adapter(this,anomaly_menu);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            return insets;
        });
    }
    private void setAnomaly_menu()
    {
        String[] MainMenuNumbers=getResources().getStringArray(R.array.anomaly_number);
        String[] MainMenuCode=getResources().getStringArray(R.array.anomaly_code);
        String[] MainMenuName=getResources().getStringArray(R.array.anomaly_name);

        for(int i=0;i<MainMenuNumbers.length;i++)
        {
            anomaly_menu.add(new anomaly_menu_model(MainMenuCode[i],MainMenuNumbers[i],MainMenuName[i],anomalyicon[i]));
        }
    }
}