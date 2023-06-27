package com.fridayhouse.aiinterviewer.ui.interview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InterviewViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is interview Fragment"
    }
    val text: LiveData<String> = _text
}