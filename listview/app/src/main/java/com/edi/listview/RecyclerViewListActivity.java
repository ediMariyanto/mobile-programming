package com.edi.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewListActivity extends AppCompatActivity {

    RecyclerView rcvKota;
    KotaAdapter kotaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list);

        rcvKota = findViewById(R.id.rcv_kota);

        String cityList[]
                = {"Tangerang Selatan", "Jakarta", "Jogjakarta", "Solo",
                "Bogor", "Bandung","Tangerang", "Serang", "Sukabumi"};

        kotaAdapter = new KotaAdapter(cityList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rcvKota.setLayoutManager(mLayoutManager);
        rcvKota.setAdapter(kotaAdapter);



    }
}