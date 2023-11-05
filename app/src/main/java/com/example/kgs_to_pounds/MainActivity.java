package com.example.kgs_to_pounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView heading,answer;
    EditText input;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heading=findViewById(R.id.heading);
        answer=findViewById(R.id.pounds);
        input=findViewById(R.id.kgs);
        convert=findViewById(R.id.button1);

       convert.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               double kilo = Double.parseDouble(input.getText().toString());
               conversion(kilo);

           }
       });

    }

    void conversion (double kilo)
    {
        double pounds = kilo*2.205;
        answer.setText(pounds + " lb");
    }

}
