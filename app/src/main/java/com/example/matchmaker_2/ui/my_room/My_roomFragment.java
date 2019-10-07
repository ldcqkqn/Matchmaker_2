package com.example.matchmaker_2.ui.my_room;

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

public class My_roomFragment extends Fragment {

    private My_roomViewModel myroomViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myroomViewModel =
                ViewModelProviders.of(this).get(My_roomViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_room, container, false);
        final TextView textView = root.findViewById(R.id.text_my_room);
        myroomViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}