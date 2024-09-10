package com.wrp.veterinariawrp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "En Veterinaria WRP, nos dedicamos con pasión y compromiso al cuidado y bienestar de tus mascotas. Con años de experiencia en el sector, nuestro equipo de veterinarios altamente capacitados y personal de apoyo se esfuerza por ofrecer una atención de calidad, basada en la confianza y el respeto por todos los animales.\n" +
                "\n" +
                "Nos especializamos en brindar una amplia gama de servicios veterinarios, que incluyen consultas de salud, vacunaciones, cirugías, cuidado dental, y emergencias. Entendemos que cada mascota es única, por lo que personalizamos nuestro enfoque para satisfacer las necesidades específicas de cada uno de nuestros pacientes.\n" +
                "\n" +
                "¡Ven a visitarnos y descubre por qué en Veterinaria WRP, tu mascota es nuestra prioridad!"
    }
    val text: LiveData<String> = _text
}