package com.example.orange.apicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("MenuApi")
public class MenuApiController {

    @RequestMapping(value = "getData", method = RequestMethod.POST)
    private String getData() {
        return "data!";
    }

}
