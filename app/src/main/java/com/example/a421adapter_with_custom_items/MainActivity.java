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
        products.add(new Product(1,2, "Танчик", R.drawable.tank));
        products.add(new Product(10,20, "Автомобильчик", R.drawable.am200));
        products.add(new Product(15,30, "Мотик", R.drawable.moto200));
        products.add(new Product(1,25, "Самолётик", R.drawable.flight200));
        products.add(new Product(90,40, "Вертолётик", R.drawable.helicopter200));
        products.add(new Product(3500,1, "Чувиха", R.drawable.girl01));
        products.add(new Product(5000,1, "Другая Чувиха", R.drawable.blondinka200));
        products.add(new Product(1500,1, "Чувиха не дорого", R.drawable.a3));
        products.add(new Product(6750,1, "Дорогая чувиха", R.drawable.a4));
        products.add(new Product(19990,0, "Всем чувихам Чувиха", R.drawable.chuvixa200));

        BasketAdapter adapter = new BasketAdapter(this, products);

        listView.setAdapter(adapter);




    }


}
