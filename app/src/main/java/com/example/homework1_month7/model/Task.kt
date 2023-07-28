package com.example.homework1_month7.model

data class Task(
    val title: String,
    var isDone: Boolean = false){

    fun toggleDone(){
        isDone = !isDone
    }
}
