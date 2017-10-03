package com.example.sigmundfreud.rosadelsvents;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Rosa dels Vents");
    }


    public void level1ButtonPressed(View view) {
        Intent intent = new Intent(this, Level1Activity.class);
        startActivity(intent);
    }

    public void level2ButtonPressed(View view) {
        Intent intent = new Intent(this, Level2Activity.class);
        startActivity(intent);
    }

    public void level3ButtonPressed(View view) {
        Intent intent = new Intent(this, Level3Activity.class);
        startActivity(intent);
    }
}
