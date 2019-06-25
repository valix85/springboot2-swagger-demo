package it.nextre.academy.demospringswagger.controller;

import it.nextre.academy.demospringswagger.service.NumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/2")
public class DeviceController {

    @Autowired
    private NumberGeneratorService generator;

    @PostMapping("/test")
    public ResponseEntity test(@RequestParam("number") Integer num ){
        return new ResponseEntity<>(generator.test(num), HttpStatus.OK);
    }

}//end class
