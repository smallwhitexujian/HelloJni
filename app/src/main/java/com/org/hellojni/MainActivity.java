package com.org.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtext = (TextView)findViewById(R.id.text2);
        HelloJni jni = new HelloJni();
        mtext.setText(jni.getClanguageString());
    }
}
