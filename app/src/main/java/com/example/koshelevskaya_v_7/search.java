package com.example.koshelevskaya_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class search extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
    }
    public void btnClik(View v){
        Intent intent = new Intent(this, personalArea.class);
        startActivity(intent);
    }
}