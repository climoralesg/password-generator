package com.climoralesg.passwordGenerator.dao;

import com.climoralesg.passwordGenerator.constant.Constants;
import com.climoralesg.passwordGenerator.models.Password;
import com.climoralesg.passwordGenerator.utils.Generate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Repository
public class PasswordDaoImpl implements PasswordDao{

    @Override
    public Map<String, Object> generatePassword(Password password) {

        Random random = new Random();
        Map<String, Object> map = new HashMap<>();
        //Flujo si contiene caracteres especiales
        if (password.getSpecialCharacters()) {
            String passwordGenerated = "";
            for (int i = 0; i < password.getNumberLetters(); i++) {
                if (random.nextBoolean()) {
                    passwordGenerated += Generate.generateSpecialCharacter();
                } else {
                    if (random.nextBoolean()) { //Si debe ser mayuscula
                        passwordGenerated += Generate.generateMaxLetter();
                    } else {
                        passwordGenerated += Generate.generateMinusLetter();
                    }
                }
            }
            map.put("password", passwordGenerated);
            //Flujo Normal, sin caracteres especiales
        } else {
            String passwordGenerated = "";
            for (int i = 0; i < password.getNumberLetters(); i++) {
                if (random.nextBoolean()) { //Si debe ser mayuscula
                    passwordGenerated += Generate.generateMaxLetter();
                } else {
                    passwordGenerated += Generate.generateMinusLetter();
                }
            }
            map.put("password", passwordGenerated);
        }
        return map;
    }

    @Override
    public String live(){
        return  "Funcionando!";
    }

}
