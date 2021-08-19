package com.supriya.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CovidAdapter extends ArrayAdapter<Model> {

    private Context context;
    private List<Model> modellist;

    public CovidAdapter(Context context, List<Model> modellist){
        super(context,R.layout.listview_layout,modellist);
        this.context = context;
        this.modellist = modellist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_layout,null,true);

        TextView state = view.findViewById(R.id.stateName);
        TextView activeCase = view.findViewById(R.id.activeno);
        TextView activeCaseToday = view.findViewById(R.id.activetoday);
        TextView curedCase = view.findViewById(R.id.curedNo);
        TextView curedCaseToday = view.findViewById(R.id.curedToday);
        TextView deathCase = view.findViewById(R.id.deathNo);
        TextView deathCaseToday = view.findViewById(R.id.deathToday);
        TextView total = view.findViewById(R.id.totalCount);

        state.setText(modellist.get(position).getName());
        activeCase.setText(modellist.get(position).getActive());
        activeCaseToday.setText(modellist.get(position).getActInc());
        curedCase.setText(modellist.get(position).getCured());
        curedCaseToday.setText(modellist.get(position).getRecInc());
        deathCase.setText(modellist.get(position).getDeath());
        deathCaseToday.setText(modellist.get(position).getDecInc());
        total.setText(modellist.get(position).getTotal());

        return view;
    }
}
