package com.mspark.toy1.toyproject.Controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class APIController {

    @RequestMapping(value = "/api/hello")
    @ResponseBody
    public String Hello() {
        log.info("Hello Test!");
        return "Hello";
    }
}
