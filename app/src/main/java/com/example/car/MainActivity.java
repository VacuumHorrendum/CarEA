package com.example.car;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String Complect;
    public String getComplect() {
        return this.Complect;
    }
    public void setComplect(String complect) {
        this.Complect = complect;
    }

    StateAdapter adapter2;
    RecyclerView rec2;
    ArrayList<Cars> cars = new ArrayList<Cars>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        rec2 = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, cars);
        // устанавливаем для списка адаптер
        adapter2 = adapter;
        rec2.setAdapter(adapter2);

    }

    private void setInitialData(){

        cars.add(new Cars ("TOYOTA CAMRY", "Черная", R.drawable.camry));
        cars.add(new Cars ("TOYOTA COROLLA", "Белая", R.drawable.corolla));
        cars.add(new Cars ("HYUNDAI SOLARIS", "Белая", R.drawable.hyundai));
    }
    public void addCar(View view){
        EditText userName = findViewById(R.id.carName);
        EditText carDesription = findViewById(R.id.carDescription);
        String carName = userName.getText().toString();
        String carDescription = carDesription.getText().toString();
        if(!carName.isEmpty()){
            if(carDescription.isEmpty()){
                carDescription = "Russia";
            }
            cars.add(new Cars(carName,carDescription,R.drawable.placeholder));
            userName.setText("");
            carDesription.setText("");
            adapter2 = new StateAdapter(this,cars);
            adapter2.notifyDataSetChanged();
            rec2.setAdapter(adapter2);
        }
    }}
