package com.main.hobbycollector.Login;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.main.hobbycollector.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fragmentManager = getFragmentManager();
        WelcomeFragment welcomeFragment = new WelcomeFragment();
        fragmentManager.beginTransaction().add(R.id.fragment_container, welcomeFragment).commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }
}
