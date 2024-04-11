package br.com.lucas.modules.password.services;

import java.util.ArrayList;
import java.util.List;

public interface ValidateUseCase {

    public boolean containsUpperCase(String password);
    public boolean containsLowerCase(String password);
    public boolean containsNumber(String password);
    public boolean containsCaracters(String password);

}
