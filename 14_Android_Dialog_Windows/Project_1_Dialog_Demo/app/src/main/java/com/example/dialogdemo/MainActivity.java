package com.example.dialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Let's listen for clicks on our regular Button.
        * We can do this with an anonymous class.
        * */

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We only handle one button
                //Therefore no switching required
                MyDialog myDialog = new MyDialog();
                myDialog.show(getSupportFragmentManager(), "123");
                //This calls onCreateDialog
                //Don't worry about the strange looking 123
                //We will find out about this in chapter 18
            }
        });

    }
}