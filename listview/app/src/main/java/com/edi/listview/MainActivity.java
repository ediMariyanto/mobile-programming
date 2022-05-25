
package com.edi.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    Button btnListView, btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        btnListView = findViewById(R.id.btn_list_view);
        btnRecyclerView = findViewById(R.id.btn_recycler_view);

        btnListView.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, ListViewActivity.class);
            startActivity(intent);
        });

        btnRecyclerView.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, RecyclerViewListActivity.class);
            startActivity(intent);
        });
    }
}