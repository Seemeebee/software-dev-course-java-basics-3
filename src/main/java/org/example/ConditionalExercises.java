package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
         if (x < 5) {
            return true;
        } else {
        return false;
    }

    public String getAgeGroup(int age) {
      if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teen";
        } else {
        return "Adult";
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        return false;
    }
}
