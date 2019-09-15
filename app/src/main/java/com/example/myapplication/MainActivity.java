package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Use class name as tag
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Button button = (Button) findViewById(R.id.showToast);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Show message in Android monitor, logcat pane
        //Log.<log-level>(TAG, "Message");
        Log.d("Error Message", "lengthy error message");


        //Layout created in Java Activity code
        LinearLayout linearL = new LinearLayout(this);
        linearL.setOrientation(LinearLayout.VERTICAL);

        TextView myText = new TextView(this);
        myText.setText("Display this text!");

        linearL.addView(myText);
        setContentView(linearL);
    }
}
