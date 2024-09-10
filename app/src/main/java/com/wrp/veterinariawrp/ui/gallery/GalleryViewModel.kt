package com.wrp.veterinariawrp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Rellena con tus datos y dale a Enviar"
    }
    val text: LiveData<String> = _text
}