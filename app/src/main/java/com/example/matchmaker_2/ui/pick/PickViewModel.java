package com.example.matchmaker_2.ui.pick;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PickViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PickViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("픽화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}