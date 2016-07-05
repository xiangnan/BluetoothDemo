package com.royole.yogu.bluetoothdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.royole.yogu.bluetoothdemo.R;
import com.royole.yogu.bluetoothdemo.fragment.ClassicFragment;

public class BluetoothActivity extends BaseActivity {
    private ClassicFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_bluetooth);
        initTitleBar("Bluetooth",true);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            mFragment = new ClassicFragment();
            transaction.replace(R.id.bluetooth_fragment, mFragment);
            transaction.commit();
        }


    }


}
