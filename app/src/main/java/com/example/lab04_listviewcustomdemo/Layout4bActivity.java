package com.example.lab04_listviewcustomdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.lab04_listviewcustomdemo.adapter.CustomGoodsAdapterGv;
import com.example.lab04_listviewcustomdemo.model.Goods;

import java.util.ArrayList;

public class Layout4bActivity extends AppCompatActivity {

    private ArrayList<Goods> goodsList;
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4b);

        gridView =findViewById(R.id.layout4b_gvGoods);
        goodsList = new ArrayList<>();
        goodsList.add(new Goods(1,"Cáp chuyển từ Cổng USB sang PS2...", "giac_chuyen", 4.0, 39, 16, 69000));
        goodsList.add(new Goods(2,"Cáp chuyển từ Cổng USB sang PS2...", "day_nguon", 4, 40, 847, 79000));
        goodsList.add(new Goods(3,"Cáp chuyển từ Cổng USB sang PS2...","dau_chuyen_doi_psps2",4,10,10,123456));
        goodsList.add(new Goods(4,"Cáp chuyển từ Cổng USB sang PS2...","dau_chuyen_doi",4,10,10,123456));
        goodsList.add(new Goods(5,"Cáp chuyển từ Cổng USB sang PS2...","car_bus_btop_s2",4,10,10,123456));
        goodsList.add(new Goods(6,"Cáp chuyển từ Cổng USB sang PS2...","dau_cam",4,10,10,123456));


        CustomGoodsAdapterGv adapterGv = new CustomGoodsAdapterGv(this,goodsList,R.layout.item_gridview);
        gridView.setAdapter(adapterGv);
    }
}