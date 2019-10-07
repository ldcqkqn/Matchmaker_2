package com.example.matchmaker_2.ui.item_mangement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Item_managementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Item_managementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("아이템관리화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}