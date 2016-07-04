package com.royole.yogu.bluetoothdemo.activity;

import android.os.Bundle;
import android.view.View;

import com.royole.yogu.bluetoothdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTitleBar("BluetoothDemo",false);
    }

    public void OnClassicBtnClick(View view){
        startOtherActivity(BluetoothActivity.class,null);
    }
}
