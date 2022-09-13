package com.example.car;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cars> cars = new ArrayList<Cars>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, cars);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        cars.add(new Cars ("TOYOTA CAMRY", "Бразилиа", R.drawable.camry));
        cars.add(new Cars ("TOYOTA COROLLA", "Буэнос-Айрес", R.drawable.corolla));
        cars.add(new Cars ("HYUNDAI SOLARIS", "Богота", R.drawable.hyundai));
    }
}