package com.example.lobotomyjournal.anomalyspackages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lobotomyjournal.R;

public class InfoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_anom_lore_data, container, false);
        if (getArguments() != null)
        {
            int data = getArguments().getInt("pos");
            String[] desc=getResources().getStringArray(R.array.anomaly_desc);
            String[] quot=getResources().getStringArray(R.array.anomaly_quotes);
            TextView textView=view.findViewById(R.id.textView18);
            TextView textView1=view.findViewById(R.id.textView19);
            textView1.setText(quot[data]);
            textView.setText(desc[data]);
        }
        return view;
    }
}
