package com.example.a10119245uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
Tanggal Pengerjaan 21 Mei 2022
NIM   : 10119245
Nama  : Apid Haryana
Kelas : IF -6
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    Context context;
    int[] images;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView rowImage;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            rowImage = itemView.findViewById(R.id.imageView);
        }

    }

    public GalleryAdapter(Context context, int[] images){
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.ViewHolder holder, int position) {
        holder.rowImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}