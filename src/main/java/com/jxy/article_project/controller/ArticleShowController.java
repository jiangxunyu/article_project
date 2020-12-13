package com.jxy.article_project.controller;

import com.jxy.article_project.entity.Article;
import com.jxy.article_project.service.ArticleShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
public class ArticleShowController {

    @Autowired
    private ArticleShowService articleShowService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showArticle(){
        return "Article";
    }

    @RequestMapping(value = "/getData",method = RequestMethod.GET)
    @ResponseBody
    public Article getData(){
        Article article = articleShowService.readArticle();
        return article;
    }
}
