# 🎮 Java Hangman Game

A simple console-based Hangman game built using Java.

---

## 🚀 Features

* Random word selection from a file
* User input for guessing letters
* ASCII Hangman drawing for wrong guesses
* Win and Lose conditions
* Tracks correct and incorrect guesses

---

## 🛠️ Technologies Used

* Java
* ArrayList
* File Handling (BufferedReader, FileReader)
* Random class
* Git & GitHub

---

## 📂 Project Structure

```
hangman-game-java
│
├── src
│   └── Main.java
│
├── words.txt
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/premraj53-ui/hangman-game-java.git
```

2. Open the project in IntelliJ IDEA or any Java IDE.

3. Make sure `words.txt` is in the correct path.

4. Run `Main.java`.

---

## 🎯 How the Game Works

* A random word is selected from `words.txt`
* The player guesses letters one by one
* Correct guesses reveal letters
* Wrong guesses draw the Hangman
* Game ends when:

  * The word is guessed ✅
  * Maximum wrong guesses reached ❌

---

## 📸 Sample Output

```
WORD: _ _ _ _ _
Guess a letter: a
WRONG

 O
/ \
```

---

## 📌 Future Improvements

* Show previously guessed letters
* Prevent duplicate guesses
* Add difficulty levels
* GUI version using Java Swing

---

## 🙌 Author

* Prem (BCA Student)
* GitHub: https://github.com/premraj53-ui

---

## ⭐ Acknowledgement

This project was built as a beginner practice project to learn Java and GitHub workflow.
