package com.mspark.toy.toyproject.Controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
public class CrawlController {

    // 스케쥴링해서 정해진 시간에 크롤링
    @RequestMapping(value = "/setNews")
    public String setNews() {
        log.info(this.getClass().getName() + " : ### setNews ###");
        return null;
    }
}
