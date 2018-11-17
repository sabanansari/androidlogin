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





       myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails();
            }

        });


    }

   public void openDetails(){
        String st,sa,sadd,sc,sgender,sbranch,syear;
       EditText nm,ag,add,clg,gen,br,yr;
       nm=findViewById(R.id.entername);
       ag=findViewById(R.id.enterage);
       add=findViewById(R.id.enteraddress);
       clg=findViewById(R.id.entercollege);
       gen=findViewById(R.id.findgender);
       br=findViewById(R.id.findbranch);
       yr=findViewById(R.id.findyear);



       Intent intent= new Intent(UserDetails.this,AllDetails.class);
       st=nm.getText().toString();
       intent.putExtra("Name",st);
       sa=ag.getText().toString();
       intent.putExtra("Age",sa);
       sadd=add.getText().toString();
       intent.putExtra("Address",sadd);
       sc=clg.getText().toString();
       intent.putExtra("College",sc);

       sgender=gen.getText().toString();
       intent.putExtra("Gender",sgender);
       sbranch=br.getText().toString();
       intent.putExtra("Branch",sbranch);
       syear=yr.getText().toString();
       intent.putExtra("Year",syear);

       startActivity(intent);

   }



}
