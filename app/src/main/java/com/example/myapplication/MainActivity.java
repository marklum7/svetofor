package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private static final String KEY_COLOR = "COLOR";
    private Integer color = R.color.white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.gr);
        if(savedInstanceState != null && savedInstanceState.containsKey(KEY_COLOR)) {
            color = savedInstanceState.getInt(KEY_COLOR);
            mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
        }
    }

    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COLOR, color);
    }

    public void OnClickBtnBel(View view){
        color = R.color.bel;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    public void OnClickBtnSin(View view){
        color = R.color.sin;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    public void OnClickBtnRks(View view){
        color = R.color.rks;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

}