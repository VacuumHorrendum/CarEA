package com.example.car;

import android.content.Context;
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

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {

        Cars state = cars.get(position);
        holder.flagView.setImageResource(state.getCarResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getDescription());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                cars.setComplect(state.plus(state.getComplect()));
//                holder.capitalView.setText(state.getComplect());
//                //holder.capitalView.setText(state.plus(state.getComplect()));
            }
        });
        holder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                state.setComplect(state.minus(state.getComplect()));
//                holder.capitalView.setText(state.getComplect());
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
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.car);
            nameView = view.findViewById(R.id.name);
            textView = view.findViewById(R.id.textView);
            capitalView = view.findViewById(R.id.description);
            button = view.findViewById(R.id.button);
            button2 = view.findViewById(R.id.button2);
        }
    }
}