package com.example.doubtbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class ChatActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var etMessage: EditText
    private lateinit var btnSend: Button
    private lateinit var adapter: ChatAdapter
    private val messages = mutableListOf<ChatMessage>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        recyclerView = findViewById(R.id.rvChat)
        etMessage = findViewById(R.id.etMessage)
        btnSend = findViewById(R.id.btnSend)

        adapter = ChatAdapter(messages)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnSend.setOnClickListener {
            val text = etMessage.text.toString().trim()

            if (text.isNotEmpty()) {

                // User message
                messages.add(ChatMessage(text, ChatMessage.SENDER_USER))
                adapter.notifyItemInserted(messages.size - 1)

                // Dummy bot reply
                messages.add(ChatMessage("Bot: $text", ChatMessage.SENDER_ASSISTANT))
                adapter.notifyItemInserted(messages.size - 1)

                recyclerView.scrollToPosition(messages.size - 1)
                etMessage.text.clear()
            }
        }
    }
}
