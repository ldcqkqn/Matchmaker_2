package com.example.matchmaker_2.ui.club_search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClubsearchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClubsearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("클럽찾기화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}