package com.example.zyh.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
           private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView =(TextView )findViewById(R.id.text);
        Ndk ndk=new Ndk();
        mTextView.setText(ndk.getCLanguageString());
    }
}
