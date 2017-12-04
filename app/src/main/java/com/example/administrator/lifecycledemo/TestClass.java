package com.example.administrator.lifecycledemo;

/**
 * Created by lishaojie on 2017/11/17.
 */

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;


public class TestClass extends AppCompatTextView implements LifecycleObserver {


    public TestClass(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void create() {
            append(System.currentTimeMillis() + "-ON_CREATE\n");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
            append(System.currentTimeMillis() + "-ON_START\n");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
           append(System.currentTimeMillis() + "-ON_RESUME\n");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
           append(System.currentTimeMillis() + "-ON_PAUSE\n");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
           append(System.currentTimeMillis() + "-ON_STOP\n");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
            Log.e("destory", System.currentTimeMillis()+"ON_DESTROY");
    }
}
