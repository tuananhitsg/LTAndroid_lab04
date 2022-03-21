package com.example.lab04_listviewcustomdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab04_listviewcustomdemo.model.Goods;
import com.example.lab04_listviewcustomdemo.R;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    private Context ctx;
    private int layoutItem;
    private ArrayList<Goods> goodsList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> goodsList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.goodsList = goodsList;
    }



    @Override
    public int getCount() {
        if(goodsList.size() != 0 && !goodsList.isEmpty())
            return goodsList.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutItem, viewGroup, false);
        }

        TextView tvName = view.findViewById(R.id.item_lv_tvName);
        TextView tvShopName = view.findViewById(R.id.item_lv_tvShopName);
        ImageView imgGoods = view.findViewById(R.id.item_lv_logo);
        final Goods goods = goodsList.get(i);

        if(goodsList !=null && !goodsList.isEmpty()){
            tvName.setText(goodsList.get(i).getName());
            tvShopName.setText(goodsList.get(i).getShopName());
            String imgGoodName = goods.getImageName();


            switch (imgGoodName) {
                case "ca_nau_lau":
                    imgGoods.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case "ga_bo_toi":
                    imgGoods.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case "xa_can_cau":
                    imgGoods.setImageResource(R.drawable.xa_can_cau);
                    break;
                case "do_choi_dang_mo_hinh":
                    imgGoods.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case "lanh_dao_gian_don":
                    imgGoods.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case "hieu_long_con_tre":
                    imgGoods.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                case "trump_1":
                    imgGoods.setImageResource(R.drawable.trump_1);
                    break;
                default:
                    break;
            }
        }


        return view;
    }
}
