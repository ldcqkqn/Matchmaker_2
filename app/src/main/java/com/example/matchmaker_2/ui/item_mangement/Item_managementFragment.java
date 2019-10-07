package com.example.matchmaker_2.ui.item_mangement;

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

public class Item_managementFragment extends Fragment {

    private Item_managementViewModel itemmanagementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        itemmanagementViewModel =
                ViewModelProviders.of(this).get(Item_managementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_item_management, container, false);
        final TextView textView = root.findViewById(R.id.text_item_management);
        itemmanagementViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}