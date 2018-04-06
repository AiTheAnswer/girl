package com.allen.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by allen on 2017/7/16.
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    @Value("${cupSize}")
    private String cupSize;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "2") Integer id) {
        return "cupSize = "+ cupSize + "id  = "+ id ;
    }
}
