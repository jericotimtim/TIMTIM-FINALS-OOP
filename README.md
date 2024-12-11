<p align="center">
  <img src="cypherlogo.png" width="300" />
</p>

<h1 align="center">Cypher</h1>

<p align="center">
    <em><code> "Your password, your protection." </code></em>
</p>

<p align="center">
    <a href="https://github.com/jericotimtim">Timtim, Abraham Jerico C.</a><br>
    IT-2106
</p>

##  PROJECT OVERVIEW

The majority of individuals struggle to generate and keep safe passwords, and they frequently choose weak or easily guessable combinations. However, strong passwords are crucial for protecting personal information and online accounts. Cypher is a Java console application designed to help users create stronger, more secure passwords by enforcing essential security standards. By offering an easy and effective way to meet these requirements, Cypher encourages users to adopt better security practices. Aligned with cybersecurity best practices, Cypher empowers users to make informed decisions when setting passwords, significantly reducing the risk of unauthorized access.


---

## CHOSEN SDG
<p>
  <img src="sdg.jpg" alt="SDG 16" width="150" />  
</p>
SDG 16 focuses on promoting peace, justice, and strong institutions by fostering transparent, accountable systems. "Cypher" directly contributes to these goals by enhancing digital security through password strength evaluation.

---

## OOP PRINCIPLES
The project incorporates Object-Oriented Programming (OOP) principles to ensure modularity, reusability, and clear structure.

1. **Encapsulation**  
   - It is implemented in the UserProfile.java file which secures user data.

2. **Inheritance**  
   - Reuses and extends functionality in BasicPasswordEvaluator.java and AdvancedPasswordEvaluator.java.  

3. **Polymorphism**  
   - This is demonstrated in the Cypher.java file, where the program decides at runtime which evaluator to use based on user input.  

4. **Abstraction**  
   - This is achieved in the PasswordEvaluator.java file using an abstract class, and it also hides complexity in PasswordEvaluator.java.

---


## FEATURES
1. **Password Breach Check**
- Integrated with the "Have I Been Pwned" API to check if a password has been part of a breach.
2. **Password Suggestions**
- The program encourages users to create stronger passwords when weaknesses are detected.
3. **Password Strength Color**
- The inclusion of the colors red, green, and yellow makes it easier for the user to determine the integrity of their password.





---
