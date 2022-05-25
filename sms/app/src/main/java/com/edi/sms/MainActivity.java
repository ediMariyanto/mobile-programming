package com.edi.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mobileno, message;
    Button sendsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobileno = findViewById(R.id.editText1);
        message = findViewById(R.id.editText2);
        sendsms = findViewById(R.id.button1);

        sendsms.setOnClickListener(view -> {
            String no = mobileno.getText().toString();
            String msg = message.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);

            //Get the SmsManager instance and call the sendTextMessage method to send message
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(no, null, msg, pi, null);

            Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                    Toast.LENGTH_LONG).show();
        });

    }

}