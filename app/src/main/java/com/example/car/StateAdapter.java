package com.example.car;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter  extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Cars> cars;
    public int number = 0;


    StateAdapter(Context context, List<Cars> cars) {
        this.cars = cars;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    public void add(String carName, String carDescription){
        cars.add(new Cars(carName,carDescription,0));

    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {

        Cars state = cars.get(position);
        holder.flagView.setImageResource(state.getCarResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getDescription());
        holder.delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int newPosition = holder.getAdapterPosition();
                Log.d("thien.van", "on Click onBindViewHolder");
                cars.remove(newPosition);
                notifyItemRemoved(newPosition);
                notifyItemRangeChanged(newPosition, cars.size());
            }
            });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.setNumberOfCars(state.plus(state.getNumberOfCars()));
                holder.textView.setText("Кол-во: "+state.getNumberOfCars());
            }
        });
        holder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.setNumberOfCars(state.minus(state.getNumberOfCars()));
                holder.textView.setText("Кол-во: "+state.getNumberOfCars());
            }
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView, textView;
        final Button button, button2;
        final ImageView delete;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.car);
            nameView = view.findViewById(R.id.name);
            textView = view.findViewById(R.id.textView);
            capitalView = view.findViewById(R.id.description);
            button = view.findViewById(R.id.button);
            button2 = view.findViewById(R.id.button2);
            delete = view.findViewById(R.id.delete);
        }
    }
}