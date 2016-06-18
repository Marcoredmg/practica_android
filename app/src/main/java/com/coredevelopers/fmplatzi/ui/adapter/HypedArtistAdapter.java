package com.coredevelopers.fmplatzi.ui.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.coredevelopers.fmplatzi.R;
import com.coredevelopers.fmplatzi.domain.Artist;

import java.util.ArrayList;

public class HypedArtistAdapter extends RecyclerView.Adapter<HypedArtistAdapter.HypedArtistViewHolder> {

    ArrayList<Artist> artists;
    Context context;

    public HypedArtistAdapter(Context context) {
        this.context = context;
        this.artists = new ArrayList<>();
    }

    @Override
    public HypedArtistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_hyped_artists, parent, false);
        return new HypedArtistViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(HypedArtistViewHolder holder, int position) {
        Artist currentArtist = artists.get(position);
        holder.setArtistName(currentArtist.getName());
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    public void addAll(@NonNull ArrayList<Artist> artists){
        if (artists == null){
            throw new NullPointerException("The items cannot be null");
        }
        this.artists.addAll(artists);
        notifyItemRangeInserted(getItemCount() - 1, artists.size());
    }

    public class HypedArtistViewHolder extends RecyclerView.ViewHolder{

        TextView name_artist;
        ImageView image_artist;

        public HypedArtistViewHolder (View itemView){
            super(itemView);
            image_artist = (ImageView) itemView.findViewById(R.id.img_artist);
            name_artist = (TextView) itemView.findViewById(R.id.txt_name);
        }

        public void setArtistName(String name){
            name_artist.setText(name);
        }
    }
}
