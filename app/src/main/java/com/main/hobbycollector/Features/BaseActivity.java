package com.main.hobbycollector.Features;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.main.hobbycollector.Features.Dashboard.UserDashboardFragment;
import com.main.hobbycollector.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        FragmentManager fragmentManager = getFragmentManager();
        UserDashboardFragment userDashboardFragment = new UserDashboardFragment();
        fragmentManager.beginTransaction().add(R.id.fragment_container, userDashboardFragment).commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }
}
