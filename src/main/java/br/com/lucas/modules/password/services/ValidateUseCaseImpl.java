package br.com.lucas.modules.password.services;

import java.util.regex.Pattern;

public class ValidateUseCaseImpl implements ValidateUseCase{

    @Override
    public boolean containsUpperCase(String password) {
        return Pattern.matches(".*[A-Z].*", password);
    }
    @Override
    public boolean containsLowerCase(String password) {
        return Pattern.matches(".*[a-z].*", password);
    }

    @Override
    public boolean containsNumber(String password) {
        return Pattern.matches(".*[1-9].*", password);
    }

    @Override
    public boolean containsCaracters(String password) {
        return Pattern.matches(".*[\\W].*", password);
    }
}
