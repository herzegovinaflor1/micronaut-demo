package com.sample;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get
    public String hi() {
        return "hi";
    }

}
