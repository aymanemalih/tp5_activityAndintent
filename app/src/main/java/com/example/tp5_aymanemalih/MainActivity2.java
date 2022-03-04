package com.example.tp5_aymanemalih;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String message = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             message = extras.getString("message");
        }
        TextView output = findViewById(R.id.textView2);
        output.setText(message);


        Button sendReponse = findViewById(R.id.send2);
        sendReponse.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        EditText t = findViewById(R.id.editTextTextPersonName3);
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result",t.getText().toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}