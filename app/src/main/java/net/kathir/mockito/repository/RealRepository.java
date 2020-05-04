package net.kathir.mockito.repository;

import androidx.lifecycle.MutableLiveData;

public class RealRepository {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
    public String getRealData()
    {
        return "This is the Real Data";
    }

    public MutableLiveData<String> getMutableLiveData(String name, String email) {

        mutableLiveData.setValue("My name is "+ name + "email is "+ email);
        return mutableLiveData;
    }
}

