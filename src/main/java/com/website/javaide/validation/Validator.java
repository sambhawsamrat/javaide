package com.website.javaide.validation;

public class Validator {

    public static boolean isValidName(String name) {
        return lengthInRange(name, 4, 40) && name.matches("^[a-zA-Z ]+$");
    }

    public static boolean isValidEmail(String email) {
        return lengthInRange(email, 5, 255) && email.matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+$");
    }

    public static boolean isValidPassword(String password) {
        return lengthInRange(password, 6, 20) && password.matches("^[a-zA-Z0-9_]+$");
    }

    private static boolean lengthInRange(String str, int min, int max) {
        return min <= str.length() && str.length() <= max;
    }
}
