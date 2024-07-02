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
        return nameService.name();
    }

    @PostMapping("/reverse")
    public String reverseName(@RequestBody String name){
        return new StringBuilder(nameService.name()).reverse().toString();
    }
}
