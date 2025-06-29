package com.example.lobotomyjournal.anomalyspackages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lobotomyjournal.R;

import java.util.List;

public class ManagerialWorksAdapter extends RecyclerView.Adapter<ManagerialWorksAdapter.WorkViewHolder> {
    private List<ManagerialWork> worksList;

    public ManagerialWorksAdapter(List<ManagerialWork> worksList) {
        this.worksList = worksList;
    }

    @NonNull
    @Override
    public WorkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_managerial_work, parent, false);
        return new WorkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkViewHolder holder, int position) {
        ManagerialWork work = worksList.get(position);
        holder.workName.setText(work.getWorkName());
        holder.workDescription.setText(work.getWorkDescription());
    }

    @Override
    public int getItemCount() { return worksList.size(); }

    // ViewHolder для элементов списка
    public static class WorkViewHolder extends RecyclerView.ViewHolder {
        TextView workName;
        TextView workDescription;

        public WorkViewHolder(@NonNull View itemView) {
            super(itemView);
            workName = itemView.findViewById(R.id.workName);
            workDescription = itemView.findViewById(R.id.workDescription);
        }
    }
}
