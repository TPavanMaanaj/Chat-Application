package com.example.chatapplication

import androidx.core.app.NotificationCompat

class Message {
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message = message
        this.senderId = senderId

    }
}