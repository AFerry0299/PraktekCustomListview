package com.praktek.customlistview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private int mResource;

    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
        this.mResource = mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String movieTitle = getItem(position).getTitle().toString();
        String movieYear = getItem(position).getYear().toString();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView txtMovie = convertView.findViewById(R.id.txtTitle);
        TextView txtYear = convertView.findViewById(R.id.txtYear);

        txtMovie.setText(movieTitle);
        txtMovie.setText(movieYear);

        return convertView;
    }
}
