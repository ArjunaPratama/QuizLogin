package com.arjuna.quizlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    private EditText etusername, etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //insialisasi komponen dlm layout
        etusername = (EditText) findViewById(R.id.etusername);
        etpassword = (EditText) findViewById(R.id.etpassword);


    }

    public void btnlogin(View view) {
        //perintah ketika tombol d Klik
        //ambil data yang sudah di masukan user
        String nama = etusername.getText().toString();
        String pass =etpassword.getText().toString();
        //ambil username dan password yang ada di string.xml
        String s_nama = getResources().getString(R.string.Username);
        String s_pass = getResources().getString(R.string.Password);
        //cocokan dengan username dan password yang ada di dlam String
        //jika txtusername == string username dan txtpassword == string password
        //maka akan pindah ke MainActivity
        if (nama.equalsIgnoreCase(s_nama) && pass.equalsIgnoreCase(s_pass)) {
            //pindah activity
            startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
            //matikan activity login
            finish();
            ;
        }else{
            //tampilkan peringatan menggunkan toast
            Toast.makeText(this, "Username or Password is Wrong", Toast.LENGTH_SHORT).show();
        }
    }
}
