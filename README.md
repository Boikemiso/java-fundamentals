# 📚 Java Fundamentals Homework

Welcome! This repository contains a comprehensive homework assignment designed to help you **revisit and solidify the core fundamentals of Java** before we go deeper into Object-Oriented Programming.

## 📖 Why This Matters

Here's the thing—I've noticed that rushing through Java basics can create gaps in understanding that make OOP concepts much harder to grasp. This homework isn't busywork; it's **intentional scaffolding** to ensure you have a rock-solid foundation. When you understand data types, scope, and method signatures at a deep level, OOP becomes so much clearer.

Think of it like building a house: you can't build a strong second floor on a weak foundation. These exercises are that foundation.

## 🎯 Learning Objectives

After completing this homework, you will:

- ✅ Understand and confidently use all primitive data types (int, double, boolean, etc.)
- ✅ Know the difference between primitive and reference types
- ✅ Master type casting and understand when precision is lost
- ✅ Recognize and handle variable scope correctly
- ✅ Use the `final` keyword for constants and immutable design
- ✅ Read and write method signatures with confidence
- ✅ Handle exceptions gracefully
- ✅ Debug code systematically

## 📋 Exercise Modules

This homework consists of **8 modules**:

1. **DataTypeExercises** - Primitive types, ranges, declarations
2. **TypeCastingExercises** - Implicit/explicit casting, precision loss
3. **StringHandlingExercises** - String operations, immutability, methods
4. **VariableScopeExercises** - Local, instance, static, block scope
5. **ConstantsAndFinalExercises** - Final keyword, immutability patterns
6. **MethodSignaturesExercises** - Parameters, overloading, varargs
7. **ExceptionHandlingExercises** - Try-catch, exception types, finally
8. **DebugMeCode** - Find and fix intentional bugs

**Estimated Time**: 8-12 hours

## 🚀 Getting Started

### Step 1: Fork This Repository
1. Click **Fork** at the top-right of this page
2. Click **Create fork**

### Step 2: Clone Your Fork
```bash
git clone https://github.com/YOUR-USERNAME/java-fundamentals.git
cd java-fundamentals
```

### Step 3: Set Up Environment
Follow [SETUP.md](SETUP.md) for JDK and Maven installation.

Verify:
```bash
java -version
mvn --version
```

## 💻 How to Complete Exercises

1. **Open exercise file** (e.g., `src/main/java/com/fundamentals/basics/DataTypeExercises.java`)
2. **Read TODO comments** - they explain what to implement
3. **Write the code** to complete each method
4. **Run tests**: `mvn test`
5. **Fix failures** based on test output

## 🧪 Running Tests

```bash
# Run all tests
mvn test

# Run specific module tests
mvn test -Dtest=DataTypeExercisesTest

# Run single test
mvn test -Dtest=DataTypeExercisesTest#testMethodName
```

**Green ✅ = Correct implementation**
**Red ❌ = Needs fixing**

## 📬 Submission Workflow

### Step 1: Commit Your Work
```bash
git add .
git commit -m "Complete Java fundamentals homework - Bongani-Xhentsa"
```

### Step 2: Push to Your Fork
```bash
git push origin main
```

### Step 3: Create Pull Request
1. Go to your fork on GitHub
2. Click **Contribute** → **Open pull request**
3. Title: `Java Fundamentals Homework - Bongani-Xhentsa`
4. Description:
   ```
   # Homework Submission
   **Name:** Bongani-Xhentsa
   **Date:** 2026-04-11
   
   ## Test Results
   All tests passing: ✅
   
   (Paste: mvn test output)
   ```
5. Click **Create pull request**

## 📊 Grading Rubric

| Criteria | Points |
|----------|--------|
| **Correctness** | 50% |
| **Code Quality** | 25% |
| **Completeness** | 15% |
| **Understanding** | 10% |

**Pass**: 70% (56 points)

## ❓ FAQ

**Can I use an IDE?**  
Yes! VSCode or IntelliJ recommended. See SETUP.md.

**Stuck on an exercise?**  
Read the TODO comments and check the test file for hints.

**Can I look at online solutions?**  
Use documentation and tutorials, but don't copy solutions.

**How long will this take?**  
8-12 hours spread over a week.

## 🔨 Troubleshooting

**"Maven command not found"**
- Reinstall Maven and add to PATH (see SETUP.md)

**"Cannot find symbol"**
- Check directory: `java-fundamentals`
- Run: `mvn clean` then `mvn test`

**Tests won't compile**
- Check method signatures match test expectations
- Verify file paths are correct

## 📖 Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Strings](https://docs.oracle.com/javase/tutorial/java/data/strings.html)
- [Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)

## 🎉 Final Thoughts

This homework builds a solid foundation. Don't rush—understanding beats speed. When you finish, OOP will feel natural because you'll understand the fundamentals deeply.

Now, let's build that foundation! 🏗️

---

**Ready?** Fork the repo and get started! 🚀
**Questions?** Reach out directly.

Happy coding! 💻