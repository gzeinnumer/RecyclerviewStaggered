package com.gzeinnumer.recyclerviewstaggered;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapterBC extends RecyclerView.Adapter<RVAdapterBC.ViewHolder> {
    List<Integer> images;
    Context context;

    public RVAdapterBC(Context context, List<Integer> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public RVAdapterBC.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_v2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapterBC.ViewHolder holder, int position) {
        int res = (int) images.get(position);
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < position; i++) {
            msg.append("loop\n");
        }
        holder.tv.setText(msg.toString());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public ViewHolder(View view) {
            super(view);
            tv =  view.findViewById(R.id.tv);
        }
    }
}
