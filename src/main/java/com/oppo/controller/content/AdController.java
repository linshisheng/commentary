package com.oppo.controller.content;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ad")
public class AdController {
    @RequestMapping
    public  String init(){
        return "/content/adList";
    }
    @RequestMapping("addInit")
    public String addInit(){
        return  "/content/adAdd";
    }
}
