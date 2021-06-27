package com.baianat.app.estshara.doctor.ui.viewmodels

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.baianat.app.estshara.doctor.models.Doctor
import com.baianat.app.estshara.doctor.ui.Event

class SharedRegisterViewModel : ViewModel() {
    val _item = MutableLiveData<Doctor>()
    val item : LiveData<Doctor> get() = _item
    private val _navigateScreen = MutableLiveData<Event<Any>>()
    val navigateScreen : LiveData<Event<Any>> = _navigateScreen


    init {
        Log.e("sharedViewModel","Done")
    }

    fun onNavigationClick(view: View, direction: Int){
        _navigateScreen.value = Event(direction)
    }


    fun setPhone(phone: String){
        item.value?.phoneNumber = phone
    }
}