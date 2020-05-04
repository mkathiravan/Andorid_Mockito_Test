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
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RealRepositoryTest {

    @Spy
    RealRepository realRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Test
    public void getRealData() {

        doReturn(realRepository.getRealData()).when(realRepository).getRealData();

        System.out.println(realRepository.getRealData());
    }

    @Test
    public void getMutableLiveData()
    {
        when(realRepository.getMutableLiveData("kathir ","kathir@gmail.com")).thenReturn(realRepository.mutableLiveData);
        System.out.println(realRepository.mutableLiveData.getValue());
    }

}