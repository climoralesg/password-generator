package com.climoralesg.passwordGenerator.utils;

import com.climoralesg.passwordGenerator.constant.Constants;

public class Generate {

    public static Integer generateOption(){
        return (int) Math.floor(Math.random() * (Constants.MAX_OPTION - Constants.MIN_OPTION + Constants.MIN_OPTION) + Constants.MIN_OPTION);
    }

    public static Character generateMaxLetter(){
        int letter = generateNumber(Constants.MIN_MINUS_LETTER, Constants.MAX_MINUS_LETTER);
        return (char) (letter - 32);
    }

    public static Character generateMinusLetter(){
        int letter = generateNumber(Constants.MIN_MINUS_LETTER, Constants.MAX_MINUS_LETTER);
        return (char) letter;
    }

    public static Character generateSpecialCharacter(){
        int letter = generateNumber(Constants.MIN_SYMBOL, Constants.MAX_SYMBOL);
        return (char) letter;
    }

    public static Integer generateNumber(int minOption, int maxOption){
        return ((int) Math.floor(Math.random() * (maxOption - minOption + 1)) + minOption);
    }

}
