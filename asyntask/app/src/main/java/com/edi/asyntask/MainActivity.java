package com.edi.asyntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRunAsyntask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnRunAsyntask = findViewById(R.id.btn_run_asyntask);
        btnRunAsyntask.setOnClickListener(view -> {
            MainActivityAsynTask mainActivityAsynTask = new MainActivityAsynTask();
            mainActivityAsynTask.execute("Kirim Parameter");
        });
    }


    private class MainActivityAsynTask extends AsyncTask<String, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            Log.i("MainActivityAsynTask", "di pre execute");
        }

        @Override
        protected Void doInBackground(String... strings) {
            Log.i("MainActivityAsynTask", "di doInBackground");
            Log.i("MainActivityAsynTask", "cetak yang dilempar kesini " + strings[0].toString());
            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            Log.i("MainActivityAsynTask", "di post execute");
        }
    }


}