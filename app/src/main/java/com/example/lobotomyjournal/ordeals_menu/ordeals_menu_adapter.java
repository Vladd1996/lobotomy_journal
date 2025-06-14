package com.example.lobotomyjournal.ordeals_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lobotomyjournal.R;
import java.util.ArrayList;

public class ordeals_menu_adapter extends RecyclerView.Adapter<ordeals_menu_adapter.MyViewHolder> {
    Context context;
    ArrayList<ordeals_menu_model> ordealsMenuModels;

    public ordeals_menu_adapter(ArrayList<ordeals_menu_model> ordealsMenuModels, Context context) {
        this.context = context;
        this.ordealsMenuModels = ordealsMenuModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ordeals_menu_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Ordeal_color_name.setText(ordealsMenuModels.get(position).getOrdeal_color_name());
        holder.bac_col.setCardBackgroundColor(ContextCompat.getColor(context, ordealsMenuModels.get(position).getCol()));
    }

    @Override
    public int getItemCount() {
        return ordealsMenuModels.size()/2;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Ordeal_color_name;
        CardView bac_col;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Ordeal_color_name = itemView.findViewById(R.id.textView9);
            bac_col = itemView.findViewById(R.id.card_view_ordeals);
        }
    }
}