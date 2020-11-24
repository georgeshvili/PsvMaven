package ru.bk252.kkso16;

class PasswordStrengthValidator1
{
    public static String checkPassword(String password) {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean specialcharacters = false;
        boolean digits = false;
        String strength = "";

        for (int index = 0; index < password.length(); index++) {
            if (Character.isUpperCase(password.charAt(index))) {
                uppercase = true;
            }
            if (Character.isLowerCase(password.charAt(index))) {
                lowercase = true;
            }
            if (Character.isDigit(password.charAt(index))) {
                digits = true;
            }
        }

        if (password.contains("~") || password.contains("!") ||
                password.contains("@") || password.contains("#") ||
                password.contains("$") || password.contains("%") ||
                password.contains("^") || password.contains("&") ||
                password.contains("*")) {
            specialcharacters = true;
        }

        if (password.length() < 8) {
            strength = "Too Short";
        } else {
            if ((uppercase && lowercase) || digits || specialcharacters) {
                strength = "Weak";
            }

            if (((uppercase && lowercase) && digits) ||
                    ((uppercase && lowercase) && specialcharacters) ||
                    (digits && specialcharacters)) {
                strength = "Medium";
            }

            if (uppercase && lowercase && digits && specialcharacters) {
                strength = "Strong";
            }
        }

        return strength;
    }
}