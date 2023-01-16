package com.climoralesg.passwordGenerator.models;

public class Password {

    private Integer numberLetters;
    private Boolean specialCharacters;

    public  Integer getNumberLetters() {
        return numberLetters;
    }

    public void setNumberLetters(Integer numberLetters) {
        this.numberLetters = numberLetters;
    }

    public Boolean getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(Boolean specialCharacters) {
        this.specialCharacters = specialCharacters;
    }
}
