package com.example.proj1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class gridAdapter  extends RecyclerView.Adapter {
    private List<DemoItem2> demoItems;
    private Context context;

    public gridAdapter(List<DemoItem2> demoItems, Context context) {
        this.demoItems = demoItems;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.grid_pic, parent, false);
        return new gridAdapter.myitemsholder2(row);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        gridAdapter.myitemsholder2 demoItemHolder = (gridAdapter.myitemsholder2) holder;
        ((myitemsholder2) holder).img.setImageResource(demoItems.get(position).getphoto());
    }

    @Override
    public int getItemCount() {
        return demoItems.size();
    }

    public class myitemsholder2 extends RecyclerView.ViewHolder {

        ImageView img;

        public myitemsholder2(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.grid_img1);
        }

    }
}