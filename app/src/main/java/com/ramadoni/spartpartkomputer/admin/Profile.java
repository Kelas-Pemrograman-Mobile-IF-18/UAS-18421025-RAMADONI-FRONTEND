package com.ramadoni.spartpartkomputer.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ramadoni.spartpartkomputer.R;
import com.ramadoni.spartpartkomputer.session.PrefSetting;

public class Profile extends AppCompatActivity {

    TextView txtUserName, txtNamaLengkap, txtEmail, txtNotelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("Profile User");

        txtUserName = (TextView) findViewById(R.id.userName);
        txtNamaLengkap = (TextView) findViewById(R.id.namaLengkap);
        txtEmail = (TextView) findViewById(R.id.email);
        txtNotelp = (TextView) findViewById(R.id.noTelp);

        txtUserName.setText(PrefSetting.userName);
        txtNamaLengkap.setText(PrefSetting.namaLengkap);
        txtEmail.setText(PrefSetting.email);
        txtNotelp.setText(PrefSetting.noTelp);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Profile.this, HomeAdminActivity.class);
        startActivity(i);
        finish();
    }
}