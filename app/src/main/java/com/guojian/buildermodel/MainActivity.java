package com.guojian.buildermodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guojian.buildermodel.structureman.ConcreateBuilder;
import com.guojian.buildermodel.structureman.Director;
import com.guojian.buildermodel.structureman.Person;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Button button6;
    protected Button button7;
    protected Button button8;
    private static final String KEY_TAG = "MainActivity.this";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {

            ConcreateBuilder builder = new ConcreateBuilder();
            Director director = new Director(builder);
            director.construct(12, "男", "ali ", "杭州", false, 12, 12);
            builder.setHeight(12)
                    .setSex("asd")
                    .setAddress("杭州");
            Person person = builder.create();
            System.out.println(KEY_TAG + person.toString());


        } else if (view.getId() == R.id.button2) {


        } else if (view.getId() == R.id.button3) {


        } else if (view.getId() == R.id.button4) {


        } else if (view.getId() == R.id.button5) {


        } else if (view.getId() == R.id.button6) {


        } else if (view.getId() == R.id.button7) {


        } else if (view.getId() == R.id.button8) {

        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(MainActivity.this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(MainActivity.this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(MainActivity.this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(MainActivity.this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(MainActivity.this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(MainActivity.this);
    }
}
