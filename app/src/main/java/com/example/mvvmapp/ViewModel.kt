package com.example.mvvmapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ViewModel(application: Application) : AndroidViewModel(application) {

    private var count: Int = 0
    private val liveDataCount = MutableLiveData<String>()

    init {
        liveDataCount.value = count.toString()
    }

    fun onButtonClick() {
        count = count + 1
        liveDataCount.postValue(count.toString())
    }

    fun getLiveDataCount(): LiveData<String> {
        return liveDataCount
    }

}

