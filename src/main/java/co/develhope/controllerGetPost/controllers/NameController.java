package co.develhope.controllerGetPost.controllers;

import co.develhope.controllerGetPost.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    NameService nameService;

    @GetMapping("/{name}")
    public String getName() {
        return nameService.getName();
    }

    @PostMapping("/reverse")
    public String reverseName(){
        return new StringBuilder(nameService.getName()).reverse().toString();
    }
}
