package com.example.matchmaker_2.ui.my_bank;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class My_bankViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public My_bankViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("마이뱅크화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}