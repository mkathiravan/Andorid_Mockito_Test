package net.kathir.mockito.repository;

import androidx.lifecycle.MutableLiveData;

public class Repository {



    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public String getData()
    {
        return "This is Data";
    }

    public void getValues(String a, String b)
    {

    }


    public MutableLiveData<String> getMutableLiveData(String name, String email) {

        mutableLiveData.setValue("My name is "+ name + "email is "+ email);
        return mutableLiveData;
    }

}
