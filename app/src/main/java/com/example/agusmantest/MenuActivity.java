package com.example.agusmantest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void mp(View view) {
        Intent intent = new Intent(MenuActivity.this, MapsActivity.class);
        startActivity(intent);
    };
    public void lv(View view) {
        Intent intent = new Intent(MenuActivity.this, ListViewActivity.class);
        startActivity(intent);
    };
    public void sms(View view) {
        Intent intent = new Intent(MenuActivity.this, SmsActivity.class);
        startActivity(intent);
    };
    public void pb(View view) {
        Intent intent = new Intent(MenuActivity.this, PhoneActivity.class);
        startActivity(intent);
    };
    public void pindah(View view) {
        startActivity(new Intent(MenuActivity.this, MainActivity.class));
        finish();
    };
}