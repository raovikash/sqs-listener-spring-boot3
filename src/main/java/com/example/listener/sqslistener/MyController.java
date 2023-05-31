package com.example.listener.sqslistener;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vikash.yadav@piramal.com
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
