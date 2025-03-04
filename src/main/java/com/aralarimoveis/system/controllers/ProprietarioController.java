package com.aralarimoveis.system.controllers;

import com.aralarimoveis.system.models.Proprietario;
import com.aralarimoveis.system.repositories.ProprietarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
public class ProprietarioController {

    private final ProprietarioRepository proprietarioRepository;

    public ProprietarioController(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }

    @GetMapping("/")
    public ModelAndView list() {
        List<Proprietario> listaProprietarios = proprietarioRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("listagens/listProprietario");
        modelAndView.addObject("proprietarios", listaProprietarios);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create () {
        return new ModelAndView("formularios/formProprietario", Map.of("proprietario", new Proprietario()));
    }

    @PostMapping("/create")
    public String create(@Valid Proprietario proprietario, BindingResult result) {
        if (result.hasErrors()) {
            return "formularios/formProprietario";
        }
        proprietarioRepository.save(proprietario);
        return "redirect:/";
    }
}