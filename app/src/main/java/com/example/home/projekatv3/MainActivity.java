package com.example.home.projekatv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText poruka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnToast);
    }

    public void onClick(View view) {
        poruka = (EditText) findViewById(R.id.etPoruka);
        Toast toast = MakeToast(poruka);
        toast.show();
    }

    private Toast MakeToast(EditText p){
        return Toast.makeText(this, p.getText().toString(), Toast.LENGTH_LONG);
    }
}
