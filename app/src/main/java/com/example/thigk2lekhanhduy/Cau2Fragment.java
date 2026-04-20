package com.example.thigk2lekhanhduy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau2Fragment extends Fragment {
    //khai baos bieens can thiet
    //khai bao bien toan cuc
    ItemLandscapAdapter adapter;
    ArrayList<LandScape> list;
    //khai bao cac bien dai dien cho ca view can tw tac
    RecyclerView recyclerViewLandscap;



    public Cau2Fragment() {
        // Required empty public constructor
    }
    public static Cau2Fragment newInstance() {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new LandScape("Lũng cú Hà Giang", "cotco"));
        list.add(new LandScape("Bà Nà Hill Đà Nẵng", "bnhill"));
        list.add(new LandScape("Phố cổ Hội An ", "hoian"));
        list.add(new LandScape("Quần thể Tràng An Ninh Bình", "quangninh"));
        list.add(new LandScape("Thác Bản Giốc Cao Bằng", "thac"));
        list.add(new LandScape("Vịnh Hạ Long", "vhlong"));




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau2 = inflater.inflate(R.layout.fragment_cau2, container, false);
        //4. tìm đk Recycler
        recyclerViewLandscap = viewCau2.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau2.getContext());
        recyclerViewLandscap.setLayoutManager(layoutLinear);
        //6. tạo adapter gắn với nguồn dl
        adapter = new ItemLandscapAdapter(viewCau2.getContext(), list);
        //7. gắn adapter với Recycler
        recyclerViewLandscap.setAdapter(adapter);


        return viewCau2;
    }
}