package com.example.matchmaker_2.ui.club_search;

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

public class Club_searchFragment extends Fragment {

    private ClubsearchViewModel clubsearchViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clubsearchViewModel =
                ViewModelProviders.of(this).get(ClubsearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_club_search, container, false);
        final TextView textView = root.findViewById(R.id.text_club_search);
        clubsearchViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}