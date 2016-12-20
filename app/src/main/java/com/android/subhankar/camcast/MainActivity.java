//package com.android.subhankar.camcast;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//    static final public String TAG = "MainActivity";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Starts the service of the HTTP server
//        this.startService(new Intent(this,CustomHttpServer.class));
//
//        // Starts the service of the RTSP server
//        this.startService(new Intent(this,CustomRtspServer.class));
//    }
//}
