package com.example.matchmaker_2.ui.my_mission;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class My_missionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public My_missionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("마이미션화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}