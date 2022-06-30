package com.posco.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Mission04Activity extends AppCompatActivity {

    private String TAG = "LAYOUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission04);
        
        TextView textView = findViewById(R.id.byteMsg);
        EditText editText = findViewById(R.id.txt_sms);

        Button button = findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //텍스트 내용이 바뀌기 전에
                Log.d(TAG,"beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //텍스트 내용이 바뀌었을 때
                Log.d(TAG,"onTextChanged");
                int strLen = editText.getText().toString().length();
                if(strLen > 80){
                    String str = editText.getText().toString();
                    editText.setText(str.toCharArray(), 0,80);
                    //Toast.makeText(Mission04Activity.this, "80글자를 초과했습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    textView.setText(editText.getText().toString().length()+"/80 바이트");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //텍스트 내용이 바꾼 후에
                Log.d(TAG,"afterTextChanged");
            }
        });


    }
}