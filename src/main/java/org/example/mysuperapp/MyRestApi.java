package org.example.mysuperapp;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MyRestApi {


    @GetMapping(produces = "application/json")
    public @ResponseBody  String hello(){
        return "{\"message\": \"hello\"}";
    }

}
