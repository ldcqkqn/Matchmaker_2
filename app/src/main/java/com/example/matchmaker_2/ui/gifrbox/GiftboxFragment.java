package com.example.matchmaker_2.ui.gifrbox;

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

public class GiftboxFragment extends Fragment {

    private GiftboxViewModel giftboxViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        giftboxViewModel =
                ViewModelProviders.of(this).get(GiftboxViewModel.class);
        View root = inflater.inflate(R.layout.fragment_giftbox, container, false);
        final TextView textView = root.findViewById(R.id.text_giftbox);
        giftboxViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}