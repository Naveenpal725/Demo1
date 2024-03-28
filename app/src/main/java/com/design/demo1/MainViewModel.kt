package com.design.demo1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _ready = MutableStateFlow(false)
    val isReady = _ready.asStateFlow()

    init {
        viewModelScope.launch {
            delay(1000L)
            _ready.value = true
        }
    }
}