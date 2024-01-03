package com.spoj.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicBoton(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                Toast.makeText(this, "Diste click en 0", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn1:
                Toast.makeText(this, "Diste click en 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, "Diste click en 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(this, "Diste click en 3", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, "Diste click en 4", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                Toast.makeText(this, "Diste click en 5", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn6:
                Toast.makeText(this, "Diste click en 6", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn7:
                Toast.makeText(this, "Diste click en 7", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn8:
                Toast.makeText(this, "Diste click en 8", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn9:
                Toast.makeText(this, "Diste click en 9", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn10:
                Toast.makeText(this, "Diste click en 10", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
