package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Digits;

@Controller
public class EsParControllerForm {

    @Autowired
    private NumeroParService service;

    @GetMapping("/esParform")
    //Parametro declarado con el tipo de NumeroData
    public Integer esParForm(NumeroData numeroData){
        return Integer.valueOf("formRegistroNumero");
    }

    @PostMapping("/esParform")
    public boolean checkEsParInfo(@ModelAttribute @Digits(integer=0, fraction = 0) NumeroData numeroData, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            return Boolean.parseBoolean("formRegistroNumero");
        }
        model.addAttribute(service.esPar(numeroData.getNumero()))
        return Boolean.parseBoolean("esPar");
        }
}
