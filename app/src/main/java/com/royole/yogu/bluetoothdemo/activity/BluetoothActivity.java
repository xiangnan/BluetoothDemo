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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent serverIntent = new Intent(mFragment.getActivity(), DeviceListActivity.class);
                mFragment.startActivityForResult(serverIntent, ClassicFragment.REQUEST_CONNECT_DEVICE_INSECURE);
//                startOtherActivity(DeviceListActivity.class, null,ClassicFragment.REQUEST_CONNECT_DEVICE_INSECURE);
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
