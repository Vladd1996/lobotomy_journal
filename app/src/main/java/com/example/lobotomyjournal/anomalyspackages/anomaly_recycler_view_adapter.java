package com.example.lobotomyjournal.anomalyspackages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.lobotomyjournal.R;

import java.util.ArrayList;

public class anomaly_recycler_view_adapter extends RecyclerView.Adapter<anomaly_recycler_view_adapter.MyViewHolder>
{
    Context context;
    ArrayList<anomaly_menu_model> anomalyMenuModels;

    public anomaly_recycler_view_adapter(Context context, ArrayList<anomaly_menu_model> anomalyMenuModels) {
        this.context = context;
        this.anomalyMenuModels = anomalyMenuModels;
    }

    @NonNull
    @Override
    public anomaly_recycler_view_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.anomalyties_menu_row,parent,false);
        return new anomaly_recycler_view_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull anomaly_recycler_view_adapter.MyViewHolder holder, int position)
    {

        holder.anomalynumber.setText(anomalyMenuModels.get(position).getAnomalyNumber());
        holder.anomalycode.setText(anomalyMenuModels.get(position).getAnomalyCode());
        holder.anomalyname.setText(anomalyMenuModels.get(position).getAnomalyName());
        holder.imageView.setImageResource(anomalyMenuModels.get(position).getAnomalyicon());
    }

    @Override
    public int getItemCount() {
        return anomalyMenuModels.size()/2;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView anomalynumber,anomalycode,anomalyname;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            anomalynumber=itemView.findViewById(R.id.textView);
            anomalycode=itemView.findViewById(R.id.textView2);
            anomalyname=itemView.findViewById(R.id.textView3);
            imageView=itemView.findViewById(R.id.imageView2);
        }
    }
}
