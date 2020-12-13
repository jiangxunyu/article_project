package com.jxy.article_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageWallController {

    @RequestMapping("/wall")
    public String messageWall(){
        return "messageWall";
    }
}
