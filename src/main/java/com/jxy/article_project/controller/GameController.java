package com.jxy.article_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameController {

    @RequestMapping("/pushBox")
    public String pushBox(){
        return "PushBox";
    }

}
