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

📂 Project Structure
app/
 ┣ java/com/example/doubtbox/
 ┃ ┣ LoginActivity.kt
 ┃ ┣ ChatActivity.kt
 ┃ ┣ MessageAdapter.kt
 ┃ ┗ ChatMessage.kt
 ┣ res/
 ┃ ┣ layout/activity_login.xml
 ┃ ┣ layout/activity_chat.xml
 ┃ ┣ layout/item_user.xml
 ┃ ┣ layout/item_assistant.xml
 ┃ ┣ drawable/
 ┃ ┃ ┣ chat_bg.xml
 ┃ ┃ ┣ rounded_white.xml
 ┃ ┃ ┣ rounded_button.xml
 ┃ ┃ ┣ bg_user.xml
 ┃ ┃ ┗ bg_assistant.xml
 ┃ ┗ values/
 ┃ ┃ ┣ colors.xml
 ┃ ┃ ┗ themes.xml
 ┗ AndroidManifest.xml

🛠️ Tech Stack

Kotlin

Android Studio

RecyclerView

Material Components

ConstraintLayout / LinearLayout

▶️ How to Run

Clone the repository:

git clone https://github.com/your-username/DoubtBox.git


Open the project in Android Studio

Let Gradle sync

Run the app on:

Emulator

or Physical Android Device

📸 Screenshots (Add your own)

You can add:

Login screen screenshot

Chat screen screenshot

Example:

![Login Screen](<img width="361" height="793" alt="image" src="https://github.com/user-attachments/assets/bec4c339-60e4-433d-baf3-ed0e751faa18" />
)
![Chat Screen](<img width="353" height="787" alt="image" src="https://github.com/user-attachments/assets/d3afb748-4203-453d-ab28-bfda10e054fc" />
)

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
