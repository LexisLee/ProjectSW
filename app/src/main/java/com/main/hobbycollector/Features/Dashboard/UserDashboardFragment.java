package com.main.hobbycollector.Features.Dashboard;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.hobbycollector.R;

import butterknife.ButterKnife;

public class UserDashboardFragment extends Fragment implements UserDashboardPresenter.View {

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
}
