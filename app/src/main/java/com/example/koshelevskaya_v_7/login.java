package com.example.koshelevskaya_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText etName, etPassword;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        etName = (EditText) findViewById(R.id.name);
        etPassword = (EditText) findViewById(R.id.password);

//        dbHelper = new DBHelper(this);

    }
    public void loginClik(View v) {
//        dbHelper.createRecord(etName.getText().toString(), etPassword.getText().toString());
        Intent intent = new Intent(this, personalArea.class);
        startActivity(intent);


        }
}