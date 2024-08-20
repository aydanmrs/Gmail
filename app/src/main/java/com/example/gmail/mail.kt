package com.example.gmail

import java.io.Serializable

class Mail(
    val person: String,
    val title: String,
    val mail: String,
    val date: String,
    val profile: Int,
    val alici: String
) : Serializable