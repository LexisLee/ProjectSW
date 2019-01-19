package com.main.hobbycollector.Login;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.hobbycollector.Features.BaseActivity;
import com.main.hobbycollector.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        super.onCreateView(inflater, viewGroup, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_loginfragment, viewGroup, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.login_button)
    public void onLoginClick() {
        startActivity(new Intent(this.getActivity(), BaseActivity.class));
    }
}
