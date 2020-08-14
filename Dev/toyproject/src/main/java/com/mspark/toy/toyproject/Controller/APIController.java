package com.mspark.toy.toyproject.Controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Log
@RestController
public class APIController {

    @RequestMapping(value = "/api/hello")
    @ResponseBody
    public String Hello() {
        log.info("Hello Test!");
        return "Hello";
    }

    @RequestMapping(value = "/api/getNews")
    @ResponseBody
    public HashMap<String, String> getNews(HttpServletRequest request, HttpServletResponse response) {
        log.info(this.getClass().getName() + " : ### getNews ###");
        HashMap<String, String> rMap = new HashMap<String, String>();

        return rMap;
    }
}
