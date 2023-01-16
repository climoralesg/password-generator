package com.climoralesg.passwordGenerator.controllers;
import com.climoralesg.passwordGenerator.dao.PasswordDao;
import com.climoralesg.passwordGenerator.models.Password;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class PasswordController {
    @Autowired
    private PasswordDao passwordDao;

    @RequestMapping(value="/generate", method = RequestMethod.GET)
    public Map<String,Object> generate(@RequestBody Password password){
        return passwordDao.generatePassword(password);
    }

    @RequestMapping(value="/live", method = RequestMethod.GET)
    public String funcionando(){
        return passwordDao.live();
        //return "holanda";
    }

    /*
    @RequestMapping(value="/generate/{password}", method = RequestMethod.GET)
    @ResponseBody
    public String generatePassword(@PathVariable String password){
        System.out.println("Password: "+ password);
        return "Holandas "+password;
    }
    */

    /*
    * PathVariable: enviamos una variable por url /url/{}/
    * RequestParam: enviamos una variable por url pero especificando su nombre /api/foos?id=abc
    * RequestBody: enviamos una variable por body, necesitamos un modelo para imprimir

    * Para RequestMapping tambien puede usarse getMapping
    * * */

}
