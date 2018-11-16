package com.example.myapplication

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import java.util.*

object Name {
    private val Names: List<String> = listOf(
            "Nanako","Emiliya", "Pedobir", "Saki"
    )

    private val _currentRandomName = MutableLiveData<String>()
    val currentRandomName: LiveData<String>
    get()= _currentRandomName

    init {
        _currentRandomName.value = Names.first()
    }
    fun getRandomName(): String{
        val random = Random()
        return Names[random.nextInt(Names.size)]
    }
    fun changeCurrentRandomName() {
        _currentRandomName.value = getRandomName()
    }
}