package com.posco.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mission04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission04);
        
        TextView textView = findViewById(R.id.byteMsg);

        EditText editText = findViewById(R.id.txt_sms);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                textView.setText(editText.getText().toString().length()+"/80 바이트");
                return false;
            }
        });

        Toast.makeText(this, "글자수 : "+editText.length(), Toast.LENGTH_LONG).show();
    }
}