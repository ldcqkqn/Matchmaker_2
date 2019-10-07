package com.example.matchmaker_2.ui.my_room;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class My_roomViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public My_roomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("마이룸화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}