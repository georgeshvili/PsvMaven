package ru.bk252.kkso16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class PasswordStrengthValidator1Test {

    @ParameterizedTest
    @ValueSource(strings = { "Too Short", "Weak", "Medium", "Strong"})
    void check(String expectedStrength) {
        String actualStrength = PasswordStrengthValidator1.checkPassword("P@ssw0rd!");
        assertEquals(expectedStrength, actualStrength);
    }
}
