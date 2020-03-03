package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView txtTentaikhoan,txtNhapPass;
    EditText edtnhapTenTK,edtidPass;
    Button btnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTentaikhoan =(TextView) findViewById(R.id.txtTentaikhoan);
        txtNhapPass =findViewById(R.id.txtNhapPass);
        edtnhapTenTK = findViewById(R.id.edtnhapTenTK);
        edtidPass = findViewById(R.id.edtidPass);
        btnButton = findViewById(R.id.btnButton);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taiKhoan = edtnhapTenTK.getText().toString();
                String matKhau = edtidPass.getText().toString();
                if(taiKhoan.equals("KTPMK16A@gmail.com")&& matKhau.equals("123")){
                    Intent a = new Intent(MainActivity.this,ChuyenActivity2.class);
                    Bundle bd = new Bundle();
                    bd.putString("key 1",taiKhoan);
                    bd.putString("key 2",matKhau);
                    a.putExtras(bd);
                    startActivity(a);
                    Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();

                }else if(taiKhoan.isEmpty()&& matKhau.isEmpty()){
                    Toast.makeText(MainActivity.this,"Bạn phải nhập tên tài khoản và mật khẩu",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this,"Đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

//    public void onClick(View view) {
//
//        if(edtnhapTenTK.toString().equals("KTPMK16A@gmail.com")){
//
//            Intent a = new Intent(MainActivity.this,ChuyenActivity2.class);
//            //a.putExtra("Khong co gi ca","No things");
//            Bundle bd= new Bundle();
//            startActivity(a);
//            Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(MainActivity.this, "Bạn đã nhập sai tài khoản", Toast.LENGTH_SHORT).show();
//        }
//    }

}
