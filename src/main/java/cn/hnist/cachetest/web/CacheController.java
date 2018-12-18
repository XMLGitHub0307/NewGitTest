package cn.hnist.cachetest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @RequestMapping("/cache")
    public String cache() {
        return "cache来了";
    }
}
