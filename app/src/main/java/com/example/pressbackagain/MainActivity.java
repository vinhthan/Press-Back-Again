package com.example.pressbackagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPress;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onBackPressed() {
        if (backPress + 2000 > System.currentTimeMillis()) {
            toast.cancel();
            super.onBackPressed();
            return;
        } else {
            toast = Toast.makeText(this, "bấm lần nữa để thoát", Toast.LENGTH_SHORT);
            toast.show();
        }
        backPress = System.currentTimeMillis();
    }
}