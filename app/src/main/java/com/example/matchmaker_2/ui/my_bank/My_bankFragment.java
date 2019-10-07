package com.example.matchmaker_2.ui.my_bank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchmaker_2.R;

public class My_bankFragment extends Fragment {

    private My_bankViewModel my_bankViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        my_bankViewModel =
                ViewModelProviders.of(this).get(My_bankViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_bank, container, false);
        final TextView textView = root.findViewById(R.id.text_mybank);
        my_bankViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}