package com.example.a421adapter_with_custom_items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class BasketAdapter extends BaseAdapter {

    ArrayList<Product> goods;
    LayoutInflater layoutInflater;
    Context ctx;

    BasketAdapter (Context context, ArrayList<Product> products) {
        ctx = context;
        goods = products;
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return goods.size();
    }

    @Override
    public Object getItem(int position) {
        return goods.get(position);
    }

    public Product getProduct(int position) {
        return goods.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
//        if (view == null)
//        {
//            view = layoutInflater.inflate(R.layout.basket_item, false);
//        }
        Product product = getProduct(position);
        ((TextView) (view.findViewById(R.id.name))).setText(product.name);
        ((TextView) (view.findViewById(R.id.price))).setText(product.price);
        ((TextView) (view.findViewById(R.id.quantity))).setText(product.quantity);
//        ImageView imageView = (ImageView) view.findViewById(R.id.image);
//        (ImageView) .getDrawable(product.image);
//        CheckBox chekBox = (CheckBox) view.findViewById(R.id.selected);
//        chekBox.setOnCheckedChangeListener(checkedChangeListener);
        return null;
    }

//    OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//        }
//    };
}
