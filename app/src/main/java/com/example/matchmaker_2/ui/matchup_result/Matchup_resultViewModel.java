package com.example.matchmaker_2.ui.matchup_result;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Matchup_resultViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Matchup_resultViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("매치업결과화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}