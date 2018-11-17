package com.example.my.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AllDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_details);

        TextView tn,ta,tc,tadd,tgender,tbranch,tyear;
        String st,sa,sc,sadd,sbranch,syear,sgender;

        tn=findViewById(R.id.nm);
        st= getIntent().getExtras().getString("Name");
        tn.setText(st);

        ta=findViewById(R.id.ag);
        sa=getIntent().getExtras().getString("Age");
        ta.setText(sa);

        tc=findViewById(R.id.clg);
        sc=getIntent().getExtras().getString("College");
        tc.setText(sc);

        tadd=findViewById(R.id.add);
        sadd=getIntent().getExtras().getString("Address");
        tadd.setText(sadd);

        tgender=findViewById(R.id.tgender);
        sgender=getIntent().getExtras().getString("Gender");
        tgender.setText(sgender);

        tbranch=findViewById(R.id.tbranch);
        sbranch=getIntent().getExtras().getString("Branch");
        tbranch.setText(sbranch);

        tyear=findViewById(R.id.tyear);
        syear=getIntent().getExtras().getString("Year");
        tyear.setText(syear);





    }
}
