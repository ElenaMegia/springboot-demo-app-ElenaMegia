package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class EsParController {

    @Autowired
    private NumeroParService service;


    //Se declara con NumeroData
    @GetMapping("/esPar")
    public String saludoForm(NumeroData numeroData){
        return "formGetNumero";
    }

    @PostMapping("/esPar")
    public String esPar(@ModelAttribute @Valid NumeroData numero, BindingResult bindingResult, Model model){
       String respuesta;
        if(bindingResult.hasErrors()){
            respuesta= "formGetNumero";
        } else{
            model.addAttribute("numero, numero.getNumero()");
            model.addAttribute("esPar", service.esPar(numero.getNumero()));
            respuesta="esParComprobado";
        }
        return respuesta;
    }







}
