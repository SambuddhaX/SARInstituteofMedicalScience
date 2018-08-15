package com.example.shreyesh.sarinstituteofmedicalscience;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminLoginActivity extends AppCompatActivity {

    private Toolbar adminToolbar;
    private TextInputLayout adminPass, adminEmail;
    private Button adminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        //Initialize views
        adminToolbar = (Toolbar) findViewById(R.id.AdminToolbar);
        adminEmail = (TextInputLayout) findViewById(R.id.adminEmail);
        adminPass = (TextInputLayout) findViewById(R.id.adminPassword);
        adminLogin = (Button) findViewById(R.id.signInAdmin);

        //Set Toolbar
        setSupportActionBar(adminToolbar);
        getSupportActionBar().setTitle("Admin Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Login Button action
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get Information from the input box in string format
                String email = adminEmail.getEditText().getText().toString();
                String password = adminPass.getEditText().getText().toString();


                //Check for validity of email,password
                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                    Toast.makeText(AdminLoginActivity.this, "Please fill details", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(AdminLoginActivity.this, "Invalid Email", Toast.LENGTH_LONG).show();
                    return;
                }


            }
        });


    }
}
