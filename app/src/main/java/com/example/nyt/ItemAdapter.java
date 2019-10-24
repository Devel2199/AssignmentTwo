package com.example.nyt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class  ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<MenuItems> itemsToAdapt;

    public void setData(ArrayList<MenuItems> itemsToAdapt) {

        this.itemsToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item, parent, false);


        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        final MenuItems articleAtPosition = itemsToAdapt.get(position);
        holder.headlineTextView.setText(articleAtPosition.getHeadline());
        holder.summaryTextView.setText(articleAtPosition.getSummary());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("ItemID", articleAtPosition.getItemID());
                context.startActivity(intent);
            }
        });

        holder.shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, articleAtPosition.getHeadline());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(articleAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headlineTextView;
        public TextView summaryTextView;
        public ImageView shareImageView;
        public ImageView itemImageView;

        public ItemViewHolder(View v) {
            super(v);
            view = v;
            headlineTextView = v.findViewById(R.id.itemHeadline);
            summaryTextView = v.findViewById(R.id.itemDetails);
            shareImageView = v.findViewById(R.id.newsShareButton);
            itemImageView = v.findViewById(R.id.itemPhoto);
        }
    }
}
