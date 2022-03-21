package com.example.lab04_listviewcustomdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab04_listviewcustomdemo.adapter.CustomGoodsAdapterLv;
import com.example.lab04_listviewcustomdemo.model.Goods;

import java.util.ArrayList;

public class Layout4aActivity extends AppCompatActivity {
    private ArrayList<Goods> goodsList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4a);

        listView =findViewById(R.id.layout4a_lvGoods);
        goodsList = new ArrayList<>();

        goodsList.add(new Goods("Ca nấu lẫu, nấu mì mini...", "Devang", "ca_nau_lau"));
        goodsList.add(new Goods("1KG Khô gà bỏ tỏi...", "LTD Food", "ga_bo_toi"));
        goodsList.add(new Goods("Xe cần cẩu đa năng", "Thế giới đồ chơi", "xa_can_cau"));
        goodsList.add(new Goods("Đồ chơi dạng mô hình", "Thế giới đồ chơi", "do_choi_dang_mo_hinh"));
        goodsList.add(new Goods("Lãnh đạo đơn giản", "Minh Long Book", "lanh_dao_gian_don"));
        goodsList.add(new Goods("Hiếu lòng con trẻ", "Minh Long Book", "hieu_long_con_tre"));
        goodsList.add(new Goods("Donald Trump Thiên tài lãnh đạo", "Minh Long Book", "trump_1"));

        CustomGoodsAdapterLv adapter =new CustomGoodsAdapterLv(this, R.layout.item_listview,goodsList);
        listView.setAdapter(adapter);
    }
}