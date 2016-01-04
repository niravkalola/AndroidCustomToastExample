package com.android.custom.toast.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCustomToast= (Button) findViewById(R.id.btnCustomToast);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Find custom toast example layout file
                View layoutValue = LayoutInflater.from(MainActivity.this).inflate(R.layout.android_custom_toast_example, null);
                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                // gravity, xOffset, yOffset
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layoutValue);//setting the view of custom toast layout
                toast.show();
            }
        });
    }
}
