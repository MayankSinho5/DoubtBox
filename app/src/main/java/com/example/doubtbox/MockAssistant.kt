package com.example.doubtbox

object MockAssistant {
    // Very simple rule-based replies for demo and offline usage
    fun generateReply(userMessage: String): String {
        val msg = userMessage.lowercase()
        return when {
            msg.contains("explain") || msg.contains("what is") || msg.contains("define") ->
                "Sure — here's a concise explanation:\n" + simpleExplain(msg)
            msg.contains("solve") || msg.contains("calculate") || msg.matches(Regex(".*\\d+.*")) ->
                "I can help solve it — show me the full problem or numbers."
            msg.contains("code") || msg.contains("kotlin") || msg.contains("android") ->
                "I can provide sample code. What specifically do you want coded?"
            msg.contains("hello") || msg.contains("hi") ->
                "Hello! How can I help with your studies today?"
            else -> "Good question — tell me more or ask me to explain step-by-step."
        }
    }


    private fun simpleExplain(msg: String): String {
        return when {
            msg.contains("hamming") -> "Hamming distance: number of differing bits between two codewords. Minimum Hamming distance determines error detection/correction capability."
            msg.contains("twisted pair") -> "Twisted Pair: two insulated wires twisted together; cheap, short distance, susceptible to EMI."
            else -> "I don't have a detailed article built-in — ask for clarification or paste the text/problem."
        }
    }
}