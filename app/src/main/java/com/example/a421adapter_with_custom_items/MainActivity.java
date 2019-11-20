package com.example.a421adapter_with_custom_items;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1,2, "Танк"));
        products.add(new Product(10,20, "Автомобиль"));
        products.add(new Product(15,30, "Мотоцикл"));

        BasketAdapter adapter = new BasketAdapter(this, products);

        listView.setAdapter(adapter);




    }


}
