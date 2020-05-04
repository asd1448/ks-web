package com.kangdonghun.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final PersonRepository personRepository;

    public IndexController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        Person person = personRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("person", person);
        return "resume";
    }
}