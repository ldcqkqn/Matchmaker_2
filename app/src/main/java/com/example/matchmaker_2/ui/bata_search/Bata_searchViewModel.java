package com.example.matchmaker_2.ui.bata_search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Bata_searchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Bata_searchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("배타찾기화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}