package com.example.matchmaker_2.ui.mesege;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MesegeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MesegeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("메시지함화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}