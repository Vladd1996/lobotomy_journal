package com.example.lobotomyjournal.anomalyspackages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lobotomyjournal.R;
import com.example.lobotomyjournal.ordeals_menu.ordeals_menu_model;

public class DetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.layout_anom_tech_data, container, false);
        if (getArguments() != null)
        {
            int data = getArguments().getInt("pos");
            String[] name=getResources().getStringArray(R.array.anomaly_name);
            String[] ThreatLVL=getResources().getStringArray(R.array.anomaly_threat_level);
            String[] good_result=getResources().getStringArray(R.array.good_result_anom);
            String[] normal_result=getResources().getStringArray(R.array.normal_result_anom);
            String[] bad_result=getResources().getStringArray(R.array.bad_result_anom);
            String[] code_name=getResources().getStringArray(R.array.anomaly_code);
            TextView textView=view.findViewById(R.id.textView10);
            TextView textView2=view.findViewById(R.id.textView15);
            TextView textView3=view.findViewById(R.id.textView13);
            TextView textView4=view.findViewById(R.id.textView16);
            TextView textView5=view.findViewById(R.id.textView17);
            TextView textView6=view.findViewById(R.id.textView14);
            int img1=getArguments().getInt("img1",0);
            int img2=getArguments().getInt("img2",0);
            ImageView imageView=view.findViewById(R.id.imageView4);
            ImageView imageView2=view.findViewById(R.id.imageView5);
            imageView.setImageResource(img1);
            imageView2.setImageResource(img2);
            textView.setText(name[data]);
            textView3.setText(good_result[data]);
            textView4.setText(normal_result[data]);
            textView5.setText(bad_result[data]);
            textView2.setText(code_name[data]);
            textView6.setText(ThreatLVL[data]);
        }
        return view;
    }
}

