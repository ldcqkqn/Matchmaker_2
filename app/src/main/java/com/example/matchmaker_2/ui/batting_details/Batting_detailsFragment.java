package com.example.matchmaker_2.ui.batting_details;

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

public class Batting_detailsFragment extends Fragment {

    private Batting_detailsViewModel batting_detailsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        batting_detailsViewModel =
                ViewModelProviders.of(this).get(Batting_detailsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_batting_details, container, false);
        final TextView textView = root.findViewById(R.id.text_batting_details);
        batting_detailsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}