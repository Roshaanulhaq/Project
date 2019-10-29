package com.example.proj1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proj1.DemoItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class reviewAdapter extends RecyclerView.Adapter {
    private List<DemoItem> demoItems;
    private Context context;
    public reviewAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems = demoItems;
        this.context = context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.review_data1, parent, false);
        return new reviewAdapter.myitemsholder(row);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        reviewAdapter.myitemsholder demoItemHolder = (reviewAdapter.myitemsholder) holder;
        ((myitemsholder) holder).na1.setText(demoItems.get(position).getName());
        ((myitemsholder) holder).rev1.setText(demoItems.get(position).getReview());
        ((myitemsholder) holder).av1.setImageResource(demoItems.get(position).getphoto());
    }

    @Override
    public int getItemCount() {
        return demoItems.size();
    }
    public class myitemsholder extends RecyclerView.ViewHolder{

        ImageView av1;
        TextView na1,rev1;

        public myitemsholder(View itemView) {
            super(itemView);
            av1=itemView.findViewById(R.id.avat1);
            na1=itemView.findViewById(R.id.name1);
            rev1=itemView.findViewById(R.id.body1);

        }
    }




}
