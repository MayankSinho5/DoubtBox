package com.example.doubtbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ChatAdapter(private val items: List<ChatMessage>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    companion object {
        private const val TYPE_USER = 0
        private const val TYPE_ASSISTANT = 1
    }


    override fun getItemViewType(position: Int): Int = items[position].sender


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_USER) {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user_message, parent, false)
            UserViewHolder(v)
        } else {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item_assistant_message, parent, false)
            AssistantViewHolder(v)
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val msg = items[position]
        if (holder is UserViewHolder) holder.bind(msg)
        else if (holder is AssistantViewHolder) holder.bind(msg)
    }


    override fun getItemCount(): Int = items.size


    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tv = view.findViewById<TextView>(R.id.tvUserMessage)
        fun bind(m: ChatMessage) { tv.text = m.text }
    }


    class AssistantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tv = view.findViewById<TextView>(R.id.tvAssistantMessage)
        fun bind(m: ChatMessage) { tv.text = m.text }
    }
}