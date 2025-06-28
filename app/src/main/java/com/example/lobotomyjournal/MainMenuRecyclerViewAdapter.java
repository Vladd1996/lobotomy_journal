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
    private final MainMenuInterface mainMenuInterface;
    Context context;
    ArrayList<MainMenuModel> MainMenuModels;

    public MainMenuRecyclerViewAdapter(ArrayList<MainMenuModel> mainMenuModels, Context context,MainMenuInterface mainMenuInterface) {
        MainMenuModels = mainMenuModels;
        this.context = context;
        this.mainMenuInterface=mainMenuInterface;
    }

    @NonNull
    @Override
    public MainMenuRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.mainmenurow,parent,false);
        return new MainMenuRecyclerViewAdapter.MyViewHolder(view,mainMenuInterface);
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

        public MyViewHolder(@NonNull View itemView,MainMenuInterface mainMenuInterface) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mainMenuInterface!=null)
                    {
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            mainMenuInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
