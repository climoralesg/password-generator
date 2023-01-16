package com.climoralesg.passwordGenerator.dao;

import com.climoralesg.passwordGenerator.models.Password;

import java.util.Map;

public interface PasswordDao {
    Map<String,Object> generatePassword(Password password);
    String live();
}
