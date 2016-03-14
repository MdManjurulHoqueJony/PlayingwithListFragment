package com.wordpress.jonyonandroidcraftsmanship.playingwithlistfragment;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MyList1Fragment extends ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(getActivity(),R.array.items,android.R.layout.simple_list_item_1);
//        setListAdapter(arrayAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(),"Item "+position,Toast.LENGTH_LONG).show();
    }
}
