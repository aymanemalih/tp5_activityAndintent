package com.example.tp5_aymanemalih;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        TextView txt = findViewById(R.id.textView3);
        txt.setVisibility(View.INVISIBLE);
    }


    @Override
    public void onClick(View view) {
        EditText input = findViewById(R.id.editTextTextPersonName);
        int LAUNCH_SECOND_ACTIVITY = 1;
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("message",input.getText().toString());
        startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                TextView txt = findViewById(R.id.textView3);
                txt.setText(result);
                txt.setVisibility(View.VISIBLE);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
            }
        }
    }

}