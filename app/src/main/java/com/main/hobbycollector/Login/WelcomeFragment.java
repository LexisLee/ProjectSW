package com.main.hobbycollector.Login;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.hobbycollector.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        super.onCreateView(inflater, viewGroup, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_welcomefragment, viewGroup, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.login_button)
    public void onLoginClick() {
        LoginFragment loginFragment = new LoginFragment();

        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, loginFragment).
                addToBackStack(null).
                commit();
    }

    @OnClick(R.id.signUp_button)
    public void onSignUpClick() {
        SignUpFragment signUpFragment = new SignUpFragment();

        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, signUpFragment).
                addToBackStack(null).
                commit();
    }
}
