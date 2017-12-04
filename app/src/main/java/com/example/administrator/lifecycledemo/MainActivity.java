package com.example.administrator.lifecycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestClass testClass = (TestClass) findViewById(R.id.tv_test);
        //将LifecycleObserver与Activity关联起来
        getLifecycle().addObserver(testClass);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
