package com.example.baidu2018.application;

import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    MainActivity mainActivity;
    @Before
    public void setUp() throws Exception {
        mainActivity = new MainActivity();
    }

    @Test
    public void printString() {
//        Log.i("main",mainActivity.printString("tt"));
        assertEquals("mytest", "tt--mainactivity返回添加的", mainActivity.printString("tt"));
    }
}