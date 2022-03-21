package com.example.lab04_listviewcustomdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.lab04_listviewcustomdemo.R;
import com.example.lab04_listviewcustomdemo.model.Goods;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CustomGoodsAdapterGv extends BaseAdapter {
    private Context context;
    private ArrayList<Goods> goodsList;
    private int layoutItem;

    public CustomGoodsAdapterGv(Context context, ArrayList<Goods> goodsList, int layoutItem) {
        this.context = context;
        this.goodsList = goodsList;
        this.layoutItem = layoutItem;
    }

    @Override
    public int getCount() {
        if (goodsList != null && !goodsList.isEmpty())
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
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutItem, viewGroup, false);
        }

        ImageView logo = view.findViewById(R.id.item_gv_logo);
        TextView tvName = view.findViewById(R.id.item_gv_tvName);
        TextView tvCount = view.findViewById(R.id.item_gv_tvVoteCounting);
        RatingBar ratingBar = view.findViewById(R.id.item_gv_ratingBar);
        TextView tvPrice = view.findViewById(R.id.item_gv_tvPrice);
        TextView tvDiscount = view.findViewById(R.id.item_gv_tvDiscount);

        final Goods goods = goodsList.get(i);

        DecimalFormat df =new DecimalFormat("#,###.##");
        if (goodsList != null && !goodsList.isEmpty()) {
            tvName.setText(goods.getName());
            ratingBar.setRating((float) goods.getRating());
            tvCount.setText("("+df.format(goods.getVote())+")");
            tvPrice.setText("("+df.format(goods.getPrice())+")");
            tvDiscount.setText("-" + df.format(goods.getDiscount()) + "%");

            int idImg = goods.getId();
            switch (idImg){
                case 1:
                    logo.setImageResource(R.drawable.car_bus_btop_s2);
                    break;
                case 2:
                    logo.setImageResource(R.drawable.dau_cam);
                    break;
                case 3:
                    logo.setImageResource(R.drawable.dau_chuyen_doi);
                    break;
                case 4:
                    logo.setImageResource(R.drawable.dau_chuyen_doi_psps2);
                    break;
                case 5:
                    logo.setImageResource(R.drawable.day_nguon);
                    break;
                case 6:
                    logo.setImageResource(R.drawable.giac_chuyen);
                    break;
                default:
                    break;
            }

        }

        return view;
    }

}
