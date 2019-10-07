package com.example.matchmaker_2.ui.batting_details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Batting_detailsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Batting_detailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("배팅내역화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}