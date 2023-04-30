package com.grogers.seedspreader.ui.addtray

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddtrayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Size"
    }
    val text: LiveData<String> = _text
}