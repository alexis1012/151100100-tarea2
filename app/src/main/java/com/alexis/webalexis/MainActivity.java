package com.alexis.webalexis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ingresar =(Button)findViewById(R.id.ingresar);
        EditText nombre = (EditText)findViewById(R.id.nombre);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre2 = nombre.getText().toString();
                Intent O = new Intent(MainActivity.this,MainActivity2.class);
                O.putExtra("llama",nombre2);
                startActivity(O);
            }
        });
    }
}