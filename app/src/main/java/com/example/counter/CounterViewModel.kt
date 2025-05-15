package com.example.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _count: MutableState<Int> = mutableIntStateOf(0)
    val count: MutableState<Int> = _count

    fun increment() = _count.value++

    fun decrement() = _count.value--
}