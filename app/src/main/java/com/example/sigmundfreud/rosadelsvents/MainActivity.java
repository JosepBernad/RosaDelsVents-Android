package com.example.sigmundfreud.rosadelsvents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.buttonLevel1:
                Log.v("1 pressed","");
                break;
            case R.id.buttonLevel2:
                Log.v("2 pressed","");
                break;
            case R.id.buttonLevel3:
                Log.v("3 pressed","");
                break;
        }

    }

}
