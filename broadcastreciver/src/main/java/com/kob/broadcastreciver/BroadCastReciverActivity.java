package com.kob.broadcastreciver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BroadCastReciverActivity extends AppCompatActivity {
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_reciver);
        intent=new Intent();
        intent.setAction("code");
        sendBroadcast(intent,null);
    }

}
