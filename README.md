## 📱 DoubtBox — Student Q&A App (Android, Kotlin)

DoubtBox is a simple Android application that allows students to ask questions and receive responses from a built-in assistant.
This project includes:

✅ Login Screen (Email + Password)
✅ Chat Screen with RecyclerView
✅ User & Assistant styled message bubbles
✅ Modern UI with gradient background
✅ Offline assistant reply (no API required)
✅ Clean Kotlin code and simple architecture

🚀 Features
🔐 Login Screen

Email validation

Password validation

Rounded input fields

Gradient background theme

💬 Chat Screen

RecyclerView with chat bubbles

User messages on the right (blue)

Assistant messages on the left (yellow)

Smooth scrolling

Simple mock AI reply

🛠️ Tech Stack

Kotlin

Android Studio

RecyclerView

Material Components

ConstraintLayout / LinearLayout

▶️ How to Run

Clone the repository:

git clone https://github.com/MayankSinhp5/DoubtBox.git

Example:
<table>
  <tr>
    <th>Login Screen:</th>
    <th>Chat Screen:</th>
   </tr>
  <tr>
    <td><img width="361" height="793" alt="image" src="https://github.com/user-attachments/assets/bec4c339-60e4-433d-baf3-ed0e751faa18" /></td>
    <td><img width="353" height="787" alt="image" src="https://github.com/user-attachments/assets/d3afb748-4203-453d-ab28-bfda10e054fc" /></td>
  </tr>
</table>
🤖 How the Assistant Works

The assistant reply is simple and local:

messages.add(ChatMessage("Bot: $text", ChatMessage.SENDER_ASSISTANT))


You can replace this with a real API later.

📌 Future Improvements

Firebase login

Real AI API integration

Chat history storage

User profiles

Dark mode
