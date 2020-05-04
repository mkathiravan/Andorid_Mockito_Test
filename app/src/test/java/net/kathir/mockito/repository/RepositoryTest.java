package net.kathir.mockito.repository;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryTest {

    @Mock
    Repository repository;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getData() {

        when(repository.getData()).thenReturn("This is mock Data");
        System.out.println(repository.getData());

        doNothing().when(repository).getValues("a","b");
    }

    @Test
    public void getMutableLiveData()
    {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("this is my data");
        when(repository.getMutableLiveData("kathir","kathir@gmail.com")).thenReturn(mutableLiveData);
        System.out.println(mutableLiveData.getValue());
    }


}