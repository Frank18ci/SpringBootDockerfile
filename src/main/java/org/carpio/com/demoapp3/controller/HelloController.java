package org.carpio.com.demoapp3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1")
public class HelloController {
    @GetMapping("hello")
    public String getSayHello(){
        return "Spring Boot 2025";
    }
    @GetMapping("/tools")
    public List<String> getTools(){
        List<String> listTools = new ArrayList<>();
        listTools.add("Java");
        listTools.add("Python");
        return listTools;
    }
    @GetMapping("/usuario/{nombre}")
    public String getUsuario(@PathVariable String nombre){
        return "Tu usuario es : " + nombre;
    }
}
