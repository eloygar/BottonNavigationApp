package com.example.bottonnavigation.ui.boton;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BotonViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BotonViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is a boton fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}