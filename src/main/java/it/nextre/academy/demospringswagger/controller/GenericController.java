package it.nextre.academy.demospringswagger.controller;

import it.nextre.academy.demospringswagger.service.NumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class GenericController {

    @Autowired
    private NumberGeneratorService generator;

    @GetMapping("/swagger")
    public void swaggerRedirect(HttpServletResponse response) {
        response.setHeader("Location", "/swagger-ui.html");
        response.setStatus(302);
    }

    @GetMapping("/even")
    public ResponseEntity getPari(){
        return new ResponseEntity<>(generator.getRandomEven(), HttpStatus.OK);
    }

    @GetMapping("/odd")
    public ResponseEntity getDispari(){
        return new ResponseEntity<>(generator.getRandomOdd(), HttpStatus.OK);
    }

}//end class
