package com.example.doubtbox

data class ChatMessage(
    val text: String,
    val sender: Int
) {
    companion object {
        const val SENDER_USER = 0
        const val SENDER_ASSISTANT = 1
    }
}