package com.example.gmail

import kotlin.random.Random

data class MailItemModel(val name: String, val time: String, val content: String = "This text is a placeholder commonly used in the printing and typesetting industry and does not have a meaningful translation since it is derived from a scrambled version of a Latin text. Would you like to know more about its origin or use?") {
    var isChecked: Boolean = false
    val colorId = Random.nextInt(5)
}