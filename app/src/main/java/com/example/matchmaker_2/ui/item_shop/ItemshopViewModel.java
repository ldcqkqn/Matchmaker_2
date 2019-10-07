package com.example.matchmaker_2.ui.item_shop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItemshopViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ItemshopViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("아이텝샵화면 입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}