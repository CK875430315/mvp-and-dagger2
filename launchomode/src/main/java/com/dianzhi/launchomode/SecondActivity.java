package com.dianzhi.launchomode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by CK on 2017/2/6.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openA(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
