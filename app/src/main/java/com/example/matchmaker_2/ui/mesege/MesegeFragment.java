package com.example.matchmaker_2.ui.mesege;

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

public class MesegeFragment extends Fragment {

    private MesegeViewModel mesegeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mesegeViewModel =
                ViewModelProviders.of(this).get(MesegeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mesege, container, false);
        final TextView textView = root.findViewById(R.id.text_mesege);
        mesegeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}