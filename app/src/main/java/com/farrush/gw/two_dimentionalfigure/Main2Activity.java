package com.farrush.gw.two_dimentionalfigure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //calling widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        //action if btnHitung is clicked
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling value from edit text & enter it to string
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();

                //checking if edit text is empty
                //condition if length is empty
                if(nPanjang.isEmpty()){
                    //give error warning
                    etPanjang.setError("Panjang Tidak Boleh Kosong");
                }else if (nLebar.isEmpty()){
                    etLebar.setError("Lebar Tidak Boleh Kosong");
                }else{

                    //change value from string to int
                    int aPanjang= Integer.parseInt(nPanjang);
                    int aLebar= Integer.parseInt(nLebar);

                    //condition if length & width isnt empty
                    int hasilhitungkeliling = (2 * aPanjang) + (2 * aLebar);
                    int hasilhitungluas = aPanjang * aLebar;

                    //show result to textView
                    txtHasil.setText("Keliling = " + hasilhitungkeliling + ", Luas = " + hasilhitungluas);
                }
            }
        });
    }
}
