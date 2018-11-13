package com.example.my.login;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);
        TextView Email= new TextView(this);
        TextView Password= new TextView(this);


        Email.setText("Email");
        Email.setTextColor(Color.BLACK);
        Password.setText("Password");
        Password.setTextColor(Color.BLACK);

        RelativeLayout.LayoutParams emailDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams PasswordDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        myLayout.setBackgroundColor(Color.GRAY);
        myButton.setBackgroundColor(Color.WHITE);
        myButton.setText("Login");

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        EditText username = new EditText(this);
        EditText password = new EditText(this);
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        username.setWidth(px);
        password.setWidth(px);

        myLayout.addView(myButton, buttonDetails);

        emailDetails.addRule(RelativeLayout.LEFT_OF,username.getId());
        PasswordDetails.addRule(RelativeLayout.LEFT_OF,password.getId());
        emailDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        PasswordDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        emailDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        PasswordDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        myButton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        usernameDetails.addRule(RelativeLayout.ABOVE, password.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        username.setTextColor(Color.BLUE);
        password.setTextColor(Color.BLUE);

        RelativeLayout.LayoutParams passwordDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        password.setId(3);
        passwordDetails.addRule(RelativeLayout.ABOVE, myButton.getId());
        passwordDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        passwordDetails.setMargins(0, 0, 0, 50);
        myLayout.addView(password, passwordDetails);


        usernameDetails.setMargins(0, 450, 0, 50);
        myLayout.addView(username, usernameDetails);

        setContentView(myLayout);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserDetails();
            }

        });
    }

    public void openUserDetails() {
            Intent intent= new Intent(this,UserDetails.class);
            startActivity(intent);
    }


}
