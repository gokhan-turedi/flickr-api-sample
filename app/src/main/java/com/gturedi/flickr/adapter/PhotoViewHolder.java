package com.gturedi.flickr.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.gturedi.flickr.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gturedi on 8.02.2017.
 */
public class PhotoViewHolder
        extends RecyclerView.ViewHolder {

    @BindView(R.id.image)
    protected ImageView image;

    public PhotoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}