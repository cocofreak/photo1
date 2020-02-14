package com.example.photo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String num1="0";
String num2="2";
String num3="1";
String num4="4";

EditText editText1;
EditText editText2;
EditText editText3;
EditText editText4;

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("0")
                        && editText2.getText().toString().equals("2")
                        && editText3.getText().toString().equals("1")
                        && editText4.getText().toString().equals("4")){
                    Toast.makeText(getApplicationContext(), "Password Match", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, imagemenu.class);
                            startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Password Not Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
