package com.baianat.app.estshara.doctor.ui

import androidx.lifecycle.Observer
import java.util.*

open class Event<out T>(private val content: T){
    var hasBeenHandled = false

    fun getContentIfNotHandled(): T?{
        return if(hasBeenHandled){
            null
        }else{
            hasBeenHandled = true
            content
        }
    }


    fun peekContent():T = content
}

class  EventObserver<T>(private val onEventUnhandledContent: (T) -> Unit) : Observer<Event<T>>{
    override fun onChanged(t: Event<T>?) {
        t?.getContentIfNotHandled()?.let {
            onEventUnhandledContent(it)
        }
    }

}