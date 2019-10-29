package com.example.proj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class frag1 extends Fragment {

    public static frag1 newInstance() {
        frag1 fragment = new frag1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);


        View.OnClickListener listnr=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getContext(),share.class);
                startActivity(i);
            }
        };

        ImageView im =(ImageView) view.findViewById(R.id.i1);
        im.setOnClickListener(listnr);

        RecyclerView recyclerViewDemo = view.findViewById(R.id.recycle2);
        recyclerViewDemo.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerViewDemo.setAdapter(new gridAdapter(feedItems(), getContext()));
        return view;
    }
    private List<DemoItem2> feedItems() {

        List<DemoItem2> demoItems = new ArrayList<>();
        DemoItem2 demo=new DemoItem2(R.drawable.cars);

        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);
        demoItems.add(demo);

        return demoItems;
    }

}