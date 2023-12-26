package com.example.koshelevskaya_v_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

    public class personalArea extends AppCompatActivity {

        //    TextView txtUser;
        DBHelper dbHelper;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//            dbHelper = new DBHelper(this);
//            dbHelper.queryData();
//            setContentView(R.layout.personalArea);
//        txtUser = (TextView) findViewById(R.id.textUser);

        }

        //    Cursor cursor = database.query()
        public void btnClik(View v){
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }
        public void btnClik2(View v){
            Intent intent = new Intent(this, search.class);
            startActivity(intent);
        }
        public void btnClik3(View v){
            Uri number = Uri.parse("tel:85654625");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        }

}