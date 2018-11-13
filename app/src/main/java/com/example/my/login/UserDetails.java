package com.example.my.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class UserDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        Button myButton= (Button) findViewById(R.id.button);


        String st;


       myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails();
            }

        });


    }

   public void openDetails(){
        String st;
       EditText nm,ag,add,clg;
       nm=findViewById(R.id.entername);
       ag=findViewById(R.id.enterage);
       add=findViewById(R.id.enteraddress);
       clg=findViewById(R.id.entercollege);


       Intent intent= new Intent(UserDetails.this,AllDetails.class);
       st=nm.getText().toString();
       intent.putExtra("Name",st);
       startActivity(intent);

   }



}
