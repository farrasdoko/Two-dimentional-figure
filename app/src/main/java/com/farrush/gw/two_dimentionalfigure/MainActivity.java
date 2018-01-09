package com.farrush.gw.two_dimentionalfigure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare widget button

    Button btnPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //call id button
        btnPersegi = (Button)findViewById(R.id.btnpersegi);
        // make button persegi can be clicked
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add intent to move to other activity
                Intent a1 = new Intent(getApplicationContext(), Main2Activity.class);
                //to move to other activity we must to add start activity
                startActivity(a1);
            }
        });
    }
}
