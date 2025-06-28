package com.example.lobotomyjournal.sephirahs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.R;
import com.example.lobotomyjournal.anomalyspackages.anomaly_recycler_view_adapter;

import java.util.ArrayList;

public class sephiras_menu_adapter extends RecyclerView.Adapter<sephiras_menu_adapter.MyViewHolder>
{
    Context context;
    ArrayList<sephiras_menu_model> sephiras_menu_models;

    public sephiras_menu_adapter(Context context, ArrayList<sephiras_menu_model> sephiras_menu_models) {
        this.context = context;
        this.sephiras_menu_models = sephiras_menu_models;
    }

    @NonNull
    @Override
    public sephiras_menu_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.sephiras_menu_row,parent,false);
        return new sephiras_menu_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sephiras_menu_adapter.MyViewHolder holder, int position) {
        holder.sephirahslayer.setText(sephiras_menu_models.get(position).getLayer());
        holder.sephirahsname.setText(sephiras_menu_models.get(position).getName());
        holder.sephirahsdescription.setText(sephiras_menu_models.get(position).getDescription());
        holder.image.setImageResource(sephiras_menu_models.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return sephiras_menu_models.size()/2;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView sephirahslayer,sephirahsname,sephirahsdescription;
        ImageView image;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            sephirahslayer=itemView.findViewById(R.id.textView4);
            sephirahsname=itemView.findViewById(R.id.textView5);
            sephirahsdescription=itemView.findViewById(R.id.textView6);
            image=itemView.findViewById(R.id.imageView3);
        }
    }

}
