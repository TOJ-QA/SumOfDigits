# ➕ Sum of Digits

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Bootcamp](https://img.shields.io/badge/Cloudberry-Java%20Automation-blue)

---

# 📖 Overview

This project calculates the **sum of the digits** in a whole number entered by the user.

The program extracts each digit using the **modulus (`%`)** and **division (`/`)** operators, adds the digits together, and displays the final sum. This exercise demonstrates a common algorithm used in many programming and mathematical applications.

This project was completed as part of my **Cloudberry Java Automation Bootcamp** to strengthen my understanding of loops, arithmetic operations, and problem-solving in Java.

---

# 🎯 Learning Objectives

✅ Accept user input using the `Scanner` class

✅ Extract digits from a number

✅ Use the modulus (`%`) operator

✅ Use integer division (`/`)

✅ Calculate the total sum of all digits

---

# 🛠 Technologies Used

- ☕ Java 21
- 💻 Eclipse IDE
- 🖥 Windows 11

---

# 📂 Project Structure

```
SumOfDigits/
│
├── src/
│   └── SumOfDigits.java
│
└── README.md
```

---

# 💻 Sample Code

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

int sum = 0;

while (number != 0) {
    sum += number % 10;
    number /= 10;
}

System.out.println("Sum of digits: " + sum);

scanner.close();
```

---

# ▶ Sample Output

### Example 1

```
Enter a number: 12345

Sum of digits: 15
```

### Example 2

```
Enter a number: 9876

Sum of digits: 30
```

---

# 🧠 Concepts Learned

📌 Scanner Class

📌 User Input

📌 Variables

📌 While Loop

📌 Modulus Operator (`%`)

📌 Integer Division (`/`)

📌 Arithmetic Operations

📌 Console Output

---

# 📸 Screenshots

## Eclipse Project

> *(Insert screenshot here)*

Example:

```
images/eclipse-project.png
```

---

## Program Code

> *(Insert screenshot here)*

Example:

```
images/code.png
```

---

## Console Output

> *(Insert screenshot here)*

Example:

```
images/output.png
```

---

# 🚀 Future Improvements

- Accept larger numbers using the `long` data type
- Validate user input to prevent invalid entries
- Calculate the product of digits
- Determine whether the number is a palindrome
- Repeat the program until the user chooses to exit

---

# 📚 What I Learned

This project helped me understand how to break a number into individual digits using arithmetic operators. By combining loops, variables, and mathematical logic, I learned an efficient way to process numeric data one digit at a time.

These techniques are commonly used in programming challenges, data validation, and algorithm development.

---

# 👨‍💻 Author

**Tracy Joseph**

QA Automation Student

Cloudberry Java Automation Bootcamp

GitHub:
https://github.com/TOJ-QA

---

⭐ Thank you for checking out my Sum of Digits project!
