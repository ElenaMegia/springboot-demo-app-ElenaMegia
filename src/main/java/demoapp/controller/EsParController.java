package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@Controller
public class EsParController {

    @Autowired
    private NumeroParService service;

    @RequestMapping("/esNumeroPar")
    





}
