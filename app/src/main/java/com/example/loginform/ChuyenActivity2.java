package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ChuyenActivity2 extends AppCompatActivity {
    TextView txtHienthiEmail,txtHienthiPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyen2);
        txtHienthiEmail = findViewById(R.id.txtHienthiEmail);
        txtHienthiPass = findViewById(R.id.txtHienthiPass);
        Bundle bd = getIntent().getExtras();
        if(bd!=null){
            String emailHienthi = bd.getString("key 1","Sai key");
            String passHienthi = bd.getString("key 2","Sai key");
            txtHienthiEmail.setText(emailHienthi);
            txtHienthiPass.setText(passHienthi);
            Toast.makeText(this,"Ban dang nhap thanh cong",Toast.LENGTH_SHORT).show();
        }
    }

}
