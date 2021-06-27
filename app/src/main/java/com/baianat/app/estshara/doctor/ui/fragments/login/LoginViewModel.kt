package com.baianat.app.estshara.doctor.ui.fragments.login

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.baianat.app.estshara.doctor.R
import com.baianat.app.estshara.doctor.ui.Event

class LoginViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var email : String? = null
    var password: String? = null

    private val _navigateScreen = MutableLiveData<Event<Any>>()

    val navigateScreen : LiveData<Event<Any>> = _navigateScreen

    fun onLoginButtonClick(view: View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            // type message here
            return
        }
        Log.d("", "")
        // transfer into HomeScreen (MainActivity)
        //_navigateScreen.value = Event(R.id.action_login_to_register)
    }
    fun onRegisterButtonClick(view: View){
        // Do something here
        //...........................

        // navigate to registerScreen
        _navigateScreen.value = Event(R.id.action_login_to_register)

    }

}