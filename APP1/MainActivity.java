package com.example.com221_introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicker(View v){
        //v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Proceed");
        b.setBackgroundColor(getResources().getColor(R.color.pula));

        EditText edtTxtInput = findViewById(R.id.edtTxtInput);
        String name = edtTxtInput.getText().toString();

        TextView txtOutput = findViewById(R.id.txtOutput1);
        txtOutput.setText("Hello mr/ms. " + name);

        try{
            EditText edtTxtAge = findViewById(R.id.edtTextAge);
            TextView txtOutputAge = findViewById(R.id.txtOutputAge);
            int age = Integer.valueOf(edtTxtAge.getText().toString());
            txtOutputAge.setText(String.valueOf(age) + " years old");
        } catch(Exception e){
            Toast.makeText(this,"Number only", Toast.LENGTH_SHORT).show();
        }
    }
}
