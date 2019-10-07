package com.example.matchmaker_2.ui.matchup_result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchmaker_2.R;

public class Matchup_resultFragment extends Fragment {

    private Matchup_resultViewModel matchup_resultViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        matchup_resultViewModel =
                ViewModelProviders.of(this).get(Matchup_resultViewModel.class);
        View root = inflater.inflate(R.layout.fragment_matchup_result, container, false);
        final TextView textView = root.findViewById(R.id.text_matchup_result);
        matchup_resultViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}