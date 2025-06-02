package com.example.lobotomyjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainMenuRecyclerViewAdapter extends RecyclerView.Adapter<MainMenuRecyclerViewAdapter.MyViewHolder>
{
    Context context;
    ArrayList<MainMenuModel> MainMenuModels;

    public MainMenuRecyclerViewAdapter(ArrayList<MainMenuModel> mainMenuModels, Context context) {
        MainMenuModels = mainMenuModels;
        this.context = context;
    }

    @NonNull
    @Override
    public MainMenuRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.mainmenurow,parent,false);
        return new MainMenuRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuRecyclerViewAdapter.MyViewHolder holder, int position)
    {
        holder.imageView.setImageResource(MainMenuModels.get(position).getOption_image());
        holder.textView.setText(MainMenuModels.get(position).getOpyion_name());
    }

    @Override
    public int getItemCount() {
        return MainMenuModels.size()/2;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
