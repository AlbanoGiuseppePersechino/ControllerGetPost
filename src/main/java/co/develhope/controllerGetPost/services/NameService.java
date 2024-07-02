package co.develhope.controllerGetPost.services;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    private final String name;

    public NameService() {
        this.name = "John";
    }

    public String getName() {
        return name;
    }


}
