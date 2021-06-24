package com.baianat.app.estshara.doctor.ui.fragments.app.login

import android.view.View
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var email : String? = null
    var password: String? = null

    fun onLoginButtonClick(view: View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            return
        }

        // Do something here
        //...........................
    }

}