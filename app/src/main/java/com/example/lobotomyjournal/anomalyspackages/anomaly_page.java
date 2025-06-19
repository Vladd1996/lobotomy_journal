package com.example.lobotomyjournal.anomalyspackages;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lobotomyjournal.R;

public class anomaly_page extends AppCompatActivity {
    int[] anomalyicon2={R.drawable.yourebaldsecport,R.drawable.trainingdummysecport,R.drawable.scorchedgirlsecport,R.drawable.onesincloseupsecport,R.drawable.hatredqueensecport,
            R.drawable.happyteddysecport,R.drawable.redshoesportrait,R.drawable.theresiasecport,R.drawable.oldladysecport,R.drawable.namelessfetussecport,
            R.drawable.wallladysecpor,R.drawable.nothingtheresecport,R.drawable.mhzsecport,R.drawable.singingmachinesecpor,R.drawable.silentorchestrasecport,
            R.drawable.woodsmansecport,R.drawable.snowqueensecport,R.drawable.bigbirdsecport,R.drawable.helpersecport,R.drawable.applecropsecport,
            R.drawable.spiderbudsecport,R.drawable.beautyandbeastsecport,R.drawable.plaguedoctorsecport,R.drawable.whitenightsecport,R.drawable.donttouchbuttonsecport,
            R.drawable.rudolfsecport,R.drawable.queenbeesecpor,R.drawable.bloodbathsecport,R.drawable.canofwheelcheerssecport,R.drawable.alriunesecport,
            R.drawable.forsakenmurderersecport,R.drawable.childofgalaxysecport,R.drawable.punishingbirdsecport,R.drawable.littleredsecport,R.drawable.bigbadwolfsecport,
            R.drawable.fragmentoftheuniverseportrait,R.drawable.crumblingarmorsecport,R.drawable.judgementbirdsecport,R.drawable.appocalypsebirdsecport,R.drawable.greedkingsecport,
            R.drawable.thelittleprincesecport,R.drawable.laetitiasecport,R.drawable.funeralofthedeadbutterflysecport,R.drawable.derfreischsecport,R.drawable.dreamofblackswansecport,
            R.drawable.dreamingcurrentsecport,R.drawable.burrowingheavensecport,R.drawable.despairknightsecport,R.drawable.nakednestsecport,R.drawable.smilingbodiesmountainsecport,
            R.drawable.schadenfreudesecport,R.drawable.theheartofaspirationsecport,R.drawable.notefromacrazedresearchersecport,R.drawable.fleshidolsecport,R.drawable.gianttreesapsecport,
            R.drawable.mirrorofadjustmentsecport,R.drawable.shelterfromthemarchsecport,R.drawable.fairyfestivalsecport,R.drawable.meatlanternsecport,R.drawable.wecanchangeanythingsecport,
            R.drawable.expresstraintohellsecport,R.drawable.scarecrowsearchingforsisdomsecport,R.drawable.dimensionalrefractionvariantsecport,R.drawable.censoredsecport,R.drawable.prophecyoftheskinsecport,
            R.drawable.portraitofanotherworldsecport,R.drawable.shylooktodaysecport,R.drawable.bluestarsecport,R.drawable.youmustbehappysecport,R.drawable.luminousbraceletsecpos,
            R.drawable.behavioradjustmentsecport,R.drawable.oldbeliefandpromisesecport,R.drawable.porccubussecport,R.drawable.voiddreamsecport,
            R.drawable.graveofcherryblossomssecport,R.drawable.firebird,R.drawable.yinsecport,R.drawable.yangsecport,R.drawable.backwardclocksecport,
            R.drawable.lalunasecport,R.drawable.armyinblacksecport,R.drawable.ppodaesecport,R.drawable.parasytetreesecport,R.drawable.meltinglovesecport,R.drawable.heroicmonksecport};
    int[] anomalyipropabicon={R.drawable.yourebaldpropab,R.drawable.trainingdummypropab,R.drawable.scorchedgirlpropab,R.drawable.onesinpropab,R.drawable.queenbeepropab,
            R.drawable.happyteddypropab,R.drawable.redshoespropab,R.drawable.noimagepropab,R.drawable.oldladypropab,R.drawable.namelessfetuspropab,
            R.drawable.wallladypropab,R.drawable.nothingtherepropab,R.drawable.mhzpropab,R.drawable.singingmachinepropab,R.drawable.silentorchestrapropab,
            R.drawable.woodsmanpropab,R.drawable.snowqueenpropab,R.drawable.bigbirdpropab,R.drawable.helperpropab,R.drawable.applescroppropab,
            R.drawable.spiderbudpropab,R.drawable.beautyandbeastpropab,R.drawable.plaguedoctorpropab,R.drawable.whitenightpropab,R.drawable.noimagepropab,
            R.drawable.rudolfpropab,R.drawable.queenbeepropab,R.drawable.bloodbathpropab,R.drawable.canofwheelcheerspropab,R.drawable.alriunepropab,
            R.drawable.forsakenmurdererpropab,R.drawable.childofgalaxypropab,R.drawable.punishingbirdpropab,R.drawable.littleredpropab,R.drawable.bigbadwolfpropab,
            R.drawable.fragmenyuniversepropab,R.drawable.crumblingarmorpropab,R.drawable.judgementbirdpropab,R.drawable.appocalypsebirdpropab,R.drawable.greedkingpropab,
            R.drawable.thelittleprincesecportpropab,R.drawable.laetitiapropab,R.drawable.funeralofthedeadbutterflypropab,R.drawable.derfreischpropab,R.drawable.dreamofblackswanpropab,
            R.drawable.dreamingcurrentpropab,R.drawable.burrowingheavenpropab,R.drawable.despairknightpropab,R.drawable.nakednestpropab,R.drawable.smilingbodiesmountainpropab,
            R.drawable.schadenfreudepropab,R.drawable.noimagepropab,R.drawable.noimagepropab,R.drawable.noimagepropab,R.drawable.noimagepropab,
            R.drawable.noimagepropab,R.drawable.noimagepropab,R.drawable.fairyfestivalpropab,R.drawable.meatlanternpropab,R.drawable.noimagepropab,
            R.drawable.noimagepropab,R.drawable.scarecrowsearchingforsisdompropab,R.drawable.dimensionalrefractionvariantpropab,R.drawable.censoredpropab,R.drawable.noimagepropab,
            R.drawable.noimagepropab,R.drawable.shylooktodaypropab,R.drawable.bluestarpropab,R.drawable.noimagepropab,R.drawable.noimagepropab,
            R.drawable.noimagepropab,R.drawable.noimagepropab,R.drawable.porccubuspropab,R.drawable.voiddreampropab,
            R.drawable.graveofcherryblossomspropab,R.drawable.fierybirdpropab,R.drawable.yinpropab,R.drawable.noimagepropab,R.drawable.noimagepropab,
            R.drawable.lalunapropab,R.drawable.armyinblackpropab,R.drawable.ppodaepropab,R.drawable.parasytetreepropab,R.drawable.meltinglovepropab,R.drawable.heroicmonkpropab};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anomaly_page);
        //__________________________________________
        int pos=getIntent().getIntExtra("pos",0);//pos-счётчик
        String[] name=getResources().getStringArray(R.array.anomaly_name);
        String[] desc=getResources().getStringArray(R.array.anomaly_desc);
        String[] quot=getResources().getStringArray(R.array.anomaly_quotes);
        String[] good_result=getResources().getStringArray(R.array.good_result_anom);
        String[] normal_result=getResources().getStringArray(R.array.normal_result_anom);
        String[] bad_result=getResources().getStringArray(R.array.bad_result_anom);
        ImageView imageView=findViewById(R.id.imageView4);
        ImageView imageView2=findViewById(R.id.imageView5);
        TextView textView=findViewById(R.id.textView10);
        TextView textView1=findViewById(R.id.textView12);
        TextView textView2=findViewById(R.id.textView11);
        TextView textView3=findViewById(R.id.textView13);
        TextView textView4=findViewById(R.id.textView16);
        TextView textView5=findViewById(R.id.textView17);
        imageView.setImageResource(anomalyicon2[pos]);
        imageView2.setImageResource(anomalyipropabicon[pos]);
        textView.setText(name[pos]);
        textView1.setText(desc[pos]);
        textView2.setText(quot[pos]);
        textView3.setText(good_result[pos]);
        textView4.setText(normal_result[pos]);
        textView5.setText(bad_result[pos]);
        //__________________________________________
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}