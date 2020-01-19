package com.example.avangers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<Avanger> {

    private Context mContext;
    private int mResource;
    private Avanger[] mAvangers;

    private static class ViewHolder {
        ImageView ivImage;
        TextView tvName;
    }

    public CustomAdapter(@NonNull Context context, int resource, @NonNull Avanger[] avangers) {
        super(context, resource, avangers);

        mContext = context;
        mResource = resource;
        mAvangers = avangers;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {
            convertView = layoutInflater.inflate(mResource, parent, false);

            viewHolder.ivImage = convertView.findViewById(R.id.ivImage);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Avanger avanger = mAvangers[position];

        viewHolder.ivImage.setImageResource(avanger.getImage());
        viewHolder.tvName.setText(avanger.getName());

        return convertView;
    }
}
