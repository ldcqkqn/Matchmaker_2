package com.example.matchmaker_2.ui.my_mission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchmaker_2.R;

public class My_missionFragment extends Fragment {

    private My_missionViewModel mymissionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mymissionViewModel =
                ViewModelProviders.of(this).get(My_missionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_mission, container, false);
        final TextView textView = root.findViewById(R.id.text_my_mission);
        mymissionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}