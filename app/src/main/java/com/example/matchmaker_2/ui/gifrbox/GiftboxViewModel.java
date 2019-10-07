package com.example.matchmaker_2.ui.gifrbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GiftboxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GiftboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("선물상자화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}