package com.example.talip.spinner;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class myArrayAdapter extends ArrayAdapter<String> {

    ArrayList<String> myList;
    Context myContext;

    public myArrayAdapter(Context c){

        super(c, R.layout.my_simple_spinner_item);

        myList = new ArrayList<String>();
        myContext = c;
    }

    @Override
    public int getCount() {
        return myList.size(); // Wieso nicht super.getCount(), wie vorgeschlagen wird?
    }

    @Override
    public void add(String item) {
        myList.add(item);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(myContext).inflate(R.layout.my_simple_spinner_item, parent, false);

        TextView t = listItem.findViewById(R.id.spinnerItem);
        t.setText(myList.get(position));

        return listItem;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        return getView(position, convertView, parent);
    }
}
