package com.allen.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by allen on 2017/7/17.
 */
@RestController
@RequestMapping(value = "/girl")
public class GirlController {

    @Autowired
    GirlRepository girlRepository;

    @RequestMapping(value = "/girls" ,method = RequestMethod.GET)
    public List<Girl> girls(){
        return  girlRepository.findAll();
    }
    @Value("${cupSize}")
    private String cupSize;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "2") Integer id) {
        return "cupSize = "+ cupSize + "id  = "+ id ;
    }
}
