package com.uplus.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import com.uplus.customnotiarr.service.CnaAgentService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent agentIntent = new Intent(this, CnaAgentService.class);
        agentIntent.setAction(CnaAgentService.AGENT_START_ACTION_NAME);
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.O) {
            startService(agentIntent);
        } else {
            startForegroundService(agentIntent);
        }



    }
}
