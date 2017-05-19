package com.example.da08.basiclayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button relbtn;
    Button linbtn;
    Button gribtn;
    Button spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relbtn = (Button) findViewById(R.id.relbtn);
        linbtn = (Button) findViewById(R.id.linbtn);
        gribtn = (Button) findViewById(R.id.gribtn);
        spin = (Button) findViewById(R.id.spin);


        relbtn.setOnClickListener(this);
        linbtn.setOnClickListener(this);
        gribtn.setOnClickListener(this);
        spin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.relbtn:
                intent = new Intent(this, RelativeActivity.class);  // 시스템 자원을 쓰기 위해 this
                startActivity(intent);  // 액티비티 호출
                break;

            case R.id.linbtn:
                intent = new Intent(this, LinearActivity.class);
                startActivity(intent);
                break;
            
            case R.id.gribtn:
                intent = new Intent(this, GridActivity.class);
                startActivity(intent);
                break;
            case R.id.spin:
                break;

        }
    }
}
