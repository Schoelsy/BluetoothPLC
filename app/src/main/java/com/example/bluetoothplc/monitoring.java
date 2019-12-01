package com.example.omron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.bluetoothplc.R;

public class monitoring extends AppCompatActivity {

    com.example.omron.ConnectedThread connectedThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring);
        connectedThread = com.example.omron.DiscoveredDevicesReceiver.getConnectedThread();
    }

    public void sendInstruction(View v)
    {
        connectedThread.run();
    }
}
