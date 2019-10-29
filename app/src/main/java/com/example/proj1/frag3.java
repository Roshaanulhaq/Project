package com.example.proj1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class frag3 extends Fragment {

    public static frag3 newInstance() {
        frag3 fragment = new frag3();
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
        View view = inflater.inflate(R.layout.frag3, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recycle1);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new reviewAdapter(feedItems(), getContext()));
        return view;

    }
    private List<DemoItem> feedItems() {
        List<DemoItem> demoItems = new ArrayList<>();

        DemoItem demoItem = new DemoItem("Roshaa Ul Haq","Very good app",R.drawable.avatar);
        DemoItem demoItem2 = new DemoItem("Muneeb Akhtar","Easy to use",R.drawable.avatar);
        DemoItem demoItem3 = new DemoItem("Hamna","Good UI",R.drawable.avatar);
        DemoItem demoItem4 = new DemoItem("Talha","My blind friend used it and he gave good reviews. hahaahahah",R.drawable.avatar);

        demoItems.add(demoItem);
        demoItems.add(demoItem2);
        demoItems.add(demoItem3);
        demoItems.add(demoItem4);
        demoItems.add(demoItem);
        demoItems.add(demoItem);
        demoItems.add(demoItem);
        demoItems.add(demoItem);
        demoItems.add(demoItem);
        demoItems.add(demoItem);


        return demoItems;
    }

}
