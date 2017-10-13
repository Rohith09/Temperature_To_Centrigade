package com.example.chandrassekhar.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;
import static com.example.chandrassekhar.temperature.R.string.temp;

public class MainActivity extends AppCompatActivity {


    public void DisplayMsg(View view)
    {
        EditText utemp;

        utemp= (EditText) findViewById(R.id.edit1);
        int cent= Integer.parseInt(utemp.getText().toString());
        double temp=cent*1.8+32;
        String message= "The Temperature in Farenheit is: "+temp;
        Toast toast=makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast toast2=makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG);
        toast2.show();


    }
}