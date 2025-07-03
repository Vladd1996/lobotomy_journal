package com.example.lobotomyjournal.anomalyspackages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.R;

import java.util.List;

public class anomaly_page_rec_view extends RecyclerView.Adapter<anomaly_page_rec_view.ViewHolder> {
    private List<ManagerialWork> worksList;

    public anomaly_page_rec_view(List<ManagerialWork> worksList) {
        this.worksList = worksList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anomaly_page_rec_view_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ManagerialWork work = worksList.get(position);
        holder.workName.setText(work.getWorkName());
        holder.workDescription.setText(work.getWorkDescription());
    }

    @Override
    public int getItemCount()
    {
        return worksList.size();
    }

    // ViewHolder для элементов списка
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView workName;
        TextView workDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            workName = itemView.findViewById(R.id.workName);
            workDescription = itemView.findViewById(R.id.workDescription);
        }
    }
}
