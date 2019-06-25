package it.nextre.academy.demospringswagger.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NumberGeneratorService {

    private Random r = new Random();

    public Integer getRandomEven() {
        Integer tmp = r.nextInt();
        return tmp%2==0?tmp:tmp+1;
    }

    public Integer getRandomOdd() {
        Integer tmp = r.nextInt();
        return tmp%2==1?tmp:tmp+1;
    }

    public String test(Integer num) {
        return num%2==0?"Even":"Odd";
    }
}//end class
